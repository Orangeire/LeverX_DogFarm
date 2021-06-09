package com.LeverX.entity.staff;

import com.LeverX.entity.buildings.Aviary;

public class Cleaner extends Worker{
    public Cleaner(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Aviary aviary = new Aviary();

    public void cleanAviary(){
        aviary.setAviaryClean(true);
    }
}

