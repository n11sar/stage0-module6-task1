package com.epam.mjc.stage0;

public class Bird extends Animal {
    private final String color;
    private final int numberOfPaws;
    boolean hasFur;
    public Bird(){
        color = "blue";
        numberOfPaws = 2;
        hasFur = false;
    }

    @Override
    public String getDescription() {
        String isHasFur = this.hasFur ? "a" : "no";
        String isPawOrPaws = this.numberOfPaws != 1 ? " paws" : " paw";
        String res = "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + isPawOrPaws + " and " + isHasFur+ " fur.";
        return res + " Moreover, it has 2 wings and can fly.";
    }
}
