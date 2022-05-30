package com.company;

public class Ravenclaw extends Hogwarts{

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int skillsRavenclaw(){
        return intelligence + wisdom + wit + creativity;
    }

    public void compareRavenclawStudents(Ravenclaw ravenclawStudent){
        int skills1 = skillsRavenclaw();
        int skills2 = ravenclawStudent.skillsRavenclaw();
        if (skills1 > skills2){
            System.out.println(getName() + " лучше чем " + ravenclawStudent.getName());
        } else if (skills1 < skills2){
            System.out.println(ravenclawStudent.getName() + " лучше чем " + getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Intelligence: " + intelligence + " Wisdom:  " + wisdom + " Wit: " + wit + " Creativity: " + creativity;
    }
}
