package com.company;

public class Gryffindor extends Hogwarts {

    private int nobleness;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgression, int nobleness, int honour, int bravery) {
        super(name, magicPower, transgression);
        this.nobleness = nobleness;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int skillsGryffindor(){
        return nobleness + honour + bravery;
    }

    public void compareGryffindorStudents(Gryffindor gryffindorStudent){
        int skills1 = skillsGryffindor();
        int skills2 = gryffindorStudent.skillsGryffindor();
        if (skills1 > skills2){
            System.out.println(getName() + " лучше чем " + gryffindorStudent.getName());
        } else if (skills1 < skills2){
            System.out.println(gryffindorStudent.getName() + " лучше чем " + getName());
        }
    }



    @Override
    public String toString() {
        return super.toString() + " Nobleness: " + nobleness + " Honour:  " + honour + " Bravery: " + bravery;
    }
}
