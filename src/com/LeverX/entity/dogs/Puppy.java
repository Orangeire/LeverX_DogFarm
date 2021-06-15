package com.LeverX.entity.dogs;

public class Puppy extends Dog{

    private boolean isDogTrained = false;

    public Puppy(int age, String name) {
        this.age = age;
        this. name = name;
    }

    public boolean isDogTrained() {
        return isDogTrained;
    }

    public void setDogTrained(boolean dogTrained) {
        isDogTrained = dogTrained;
        setDogHungry(true);
    }

}
