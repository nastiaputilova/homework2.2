package com.company;

public class Main {

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 5, 2, 8, 4, 9);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 9, 7, 5,7,8);
        Gryffindor ron = new Gryffindor("Рон Уизли", 3,4,3,6,2);
        Slytherin draco = new Slytherin("Драко Малфой", 4, 5,6, 5, 6,3,8);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 2, 3,2,3,4,3,5);
        Slytherin gregory = new Slytherin("Грегори Гойл ", 3,4,5,3,6,7,5);
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 4,5,6,8,9);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 5, 7,8, 5,6);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 4,8,5,7,6);
        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 6,3,5,6,7,8);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 5,6,7,8,5,7);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 5,7,6,9,7,7);

        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(ron);
        System.out.println(draco);
        System.out.println(graham);
        System.out.println(gregory);
        System.out.println(zacharias);
        System.out.println(cedric);
        System.out.println(justin);
        System.out.println(cho);
        System.out.println(padma);
        System.out.println(marcus);

        harry.compareAllStudents(cedric);
        harry.compareGryffindorStudents(hermione);
        draco.compareSlytherinStudents(graham);
        cedric.compareHufflepuffStudents(justin);
        cho.compareRavenclawStudents(padma);

    }

}
