package com.juaracoding.oop;

public class Fruit {

    // state
    protected int gram;
    protected int calsPerGram;

    // behavior
    protected int totalCalories() {
        return gram * calsPerGram;
    }


}