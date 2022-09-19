package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(){

    }
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription() {
        String isHasFur = this.hasFur ? "a" : "no";
        String isPawOrPaws = this.numberOfPaws != 1 ? " paws" : " paw";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + isPawOrPaws + " and " + isHasFur+ " fur.";
    }

}
