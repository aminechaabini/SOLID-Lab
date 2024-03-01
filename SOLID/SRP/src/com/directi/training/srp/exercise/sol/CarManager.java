package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private final carDb carDb;

    public CarManager() {
        this.carDb = new CarDb();
        this.carOperations = new CarOperations(carDb.getAllCars());
    }

    public Car getFromDb(final String carId)
    {
        return carDb.getCarById(carId);
    }

    public String getCarsNames(){
        return carOperations.getCarsNames();
    }

    public Car getBestCar(){
        return carOperations.getBestCar()

    }


}
