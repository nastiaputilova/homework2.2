package com.company;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int skillsHufflepuff(){
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuffStudents(Hufflepuff hufflepuffStudent){
        int skills1 = skillsHufflepuff();
        int skills2 = hufflepuffStudent.skillsHufflepuff();
        if (skills1 > skills2){
            System.out.println(getName() + " лучше чем " + hufflepuffStudent.getName());
        } else if (skills1 < skills2){
            System.out.println(hufflepuffStudent.getName() + " лучше чем " + getName());
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Diligence: " + diligence + " Loyalty:  " + loyalty + " Honesty: " + honesty;
    }
}
