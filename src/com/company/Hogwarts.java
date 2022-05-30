package com.company;

public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression){
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }


    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print(){
        System.out.println(this);
    }

    public int skillsHogwarts(){
        return magicPower + transgression;
    }

    public void compareAllStudents(Hogwarts student){
        int skills1 = skillsHogwarts();
        int skills2 = student.skillsHogwarts();
        if (skills1 > skills2){
            System.out.println(getName() + " лучше чем " + student.getName());
        } else if (skills1 < skills2){
            System.out.println(student.getName() + " лучше чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " Magic power: " + magicPower + " Transgression: " + transgression;
    }
}
