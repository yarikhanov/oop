package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.iterator;

public class JavaDev implements Collection{

    String name;
    String [] skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public JavaDev(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
