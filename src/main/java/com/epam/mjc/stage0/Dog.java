package com.epam.mjc.stage0;

public class Dog extends Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;
    public Dog(){
        color = "brown";
        numberOfPaws = 4;
        hasFur = true;
    }

    @Override
    public String getDescription() {
        super.getDescription();
        String isHasFur = this.hasFur ? "a" : "no";
        String isPawOrPaws = this.numberOfPaws != 1 ? " paws" : " paw";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + isPawOrPaws + " and " + isHasFur+ " fur.";
    }
}
