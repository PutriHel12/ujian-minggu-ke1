package com.juaracoding.oop;

public class MainAppOOP {

    public static void main(String[] args) {

        // instance object
        Fruit apel = new Fruit();
        apel.gram = 100;
        apel.calsPerGram = 52;
        System.out.println(apel.totalCalories());

        Fruit mangga = new Fruit();
        mangga.gram = 100;
        mangga.calsPerGram = 60;
        System.out.println(mangga.totalCalories());

    }

}