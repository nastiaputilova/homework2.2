package com.company;

public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int ingenuity, int lustForPower) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int skillsSlytherin(){
        return determination + ambition + ingenuity + lustForPower;
    }

    public void compareSlytherinStudents(Slytherin slytherinStudent){
        int skills1 = skillsSlytherin();
        int skills2 = slytherinStudent.skillsSlytherin();
        if (skills1 > skills2){
            System.out.println(getName() + " лучше чем " + slytherinStudent.getName());
        } else if (skills1 < skills2){
            System.out.println(slytherinStudent.getName() + " лучше чем " + getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Cunning: " + cunning + " Determination:  " + determination + " Ambition: " + ambition + " Ingenuity: " + ingenuity+ " Lust for power: " + lustForPower;
    }
}
