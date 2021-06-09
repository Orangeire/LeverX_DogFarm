package com.LeverX.entity.staff;

import com.LeverX.entity.dogs.Dog;

public class Veterinarian extends Worker {

    public void healDog(Dog dog){
        Dog.setDogHealthy(true);
        System.out.println(dog.getName() + " is healthy now!");
    }
}
