package com.LeverX;

import com.LeverX.entity.buildings.Aviary;
import com.LeverX.entity.buildings.TrainingGround;
import com.LeverX.entity.dogs.AdultDog;
import com.LeverX.entity.dogs.Dog;
import com.LeverX.entity.dogs.OldDog;
import com.LeverX.entity.dogs.Puppy;
import com.LeverX.entity.staff.Cleaner;
import com.LeverX.entity.staff.Veterinarian;

import java.util.ArrayList;
import java.util.List;

public class DaySimulation {

    private AdultDog cooper = new AdultDog(5, "Cooper");
    private AdultDog ajax = new AdultDog(4, "Ajax");
    private OldDog hachi = new OldDog(10, "Hachi");
    private Puppy dexter = new Puppy(1, "Dexter");
    private Veterinarian veterinarian = new Veterinarian();
    private Cleaner cleaner = new Cleaner("Sidorov", "Ivan", 27);
    private TrainingGround trainingGround = new TrainingGround();
    List<Dog> dogs = new ArrayList<>();

    public void simulateDay(){
        dogs.add(cooper);
        dogs.add(ajax);
        dogs.add(hachi);
        dogs.add(dexter);
        breakfast();
        veterinarianCheck();
        aviaryCleaning();
        training();
        work();
        supper();
    }

    private void breakfast() {
        System.out.println("Good morning! New day starts with breakfast.");
        for (Dog dog:
             dogs) {
            dog.setDogHungry(false);
        }
    }

    private void veterinarianCheck() {
        for (Dog dog:
                dogs) {
            if (dog.getClass().equals(OldDog.class)) {
                veterinarian.healDog((OldDog) dog);
            }
        }
    }

    private void aviaryCleaning() {
        System.out.println(cleaner.getName() + " " + cleaner.getSurname() + " cleans aviary");
        cleaner.cleanAviary();
        System.out.println("Aviary is clean now!");

    }

    private void training() {
        System.out.println("Puppies are go to training");
        for (Dog dog:
             dogs) {
            if (dog.getClass().equals(Puppy.class)) {
                trainingGround.trainPuppy((Puppy) dog);
            }
        }
    }

    private void work() {
        System.out.println("Adult dogs are go to work");
        for (Dog dog:
                dogs) {
            if (dog.getClass().equals(AdultDog.class)) {
                ((AdultDog) dog).workInEmergency();
                System.out.println(dog.getName() + " works in emergency.");
            }
        }
    }

    private void supper() {
        System.out.println("End of the day. All Dogs are going to supper.");
        System.out.println("Good morning! New day starts with breakfast.");
        for (Dog dog:
                dogs) {
            dog.setDogHungry(false);
        }
    }
}
