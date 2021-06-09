package com.LeverX;

import com.LeverX.entity.buildings.Aviary;
import com.LeverX.entity.buildings.TrainingGround;
import com.LeverX.entity.dogs.AdultDog;
import com.LeverX.entity.dogs.Dog;
import com.LeverX.entity.dogs.OldDog;
import com.LeverX.entity.dogs.Puppy;
import com.LeverX.entity.staff.Cleaner;
import com.LeverX.entity.staff.Veterinarian;

public class DaySimulation {

    private AdultDog cooper = new AdultDog(5, "Cooper");
    private AdultDog ajax = new AdultDog(4, "Ajax");
    private OldDog hachi = new OldDog(10, "Hachi");
    private Puppy dexter = new Puppy(1, "Dexter");
    private Veterinarian veterinarian = new Veterinarian();
    private Cleaner cleaner = new Cleaner("Sidorov", "Ivan", 27);
    private TrainingGround trainingGround = new TrainingGround();


    public void simulateDay(){
        breakfast();
        veterinarianCheck();
        aviaryCleaning();
        training();
        work();
        supper();
    }

    private void breakfast() {
        System.out.println("Good morning! New day starts with breakfast.");
    }

    private void veterinarianCheck() {
        veterinarian.healDog(hachi);
    }

    private void aviaryCleaning() {
        System.out.println(cleaner.getName() + " " + cleaner.getSurname() + " cleans aviary");
        cleaner.cleanAviary();
        System.out.println("Aviary is clean now!");

    }

    private void training() {
        System.out.println("Puppies are go to training");
        trainingGround.trainPuppy(dexter);
//        dexter.setDogTrained(true);
//        System.out.println("Dexter is trained now!");
    }

    private void work() {
        System.out.println("Adult dogs are go to work");
        cooper.workInEmergency();
        ajax.workInPolice();
        System.out.println("Cooper works in emergency. Ajax works in police.");
    }

    private void supper() {
        System.out.println("End of the day. All Dogs are going to supper.");
    }
}
