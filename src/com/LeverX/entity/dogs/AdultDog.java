package com.LeverX.entity.dogs;

public class AdultDog extends Dog{

    public AdultDog(int age, String name) {
        this.age = age;
        this. name = name;
    }

    public void workInPolice(){
        setDogHungry(true);
    }

    public void workInEmergency(){
        setDogHungry(true);
    }

}
