package com.LeverX.entity.buildings;

import com.LeverX.entity.dogs.Puppy;

public class TrainingGround {

    public void trainPuppy(Puppy puppy){
        puppy.setDogTrained(true);
        System.out.println(puppy.getName() + " is trained now!");
    }
}
