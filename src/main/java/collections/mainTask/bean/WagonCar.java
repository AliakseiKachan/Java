package collections.mainTask.bean;

import collections.mainTask.enums.CarBrand;
import collections.mainTask.enums.CarClass;
import collections.mainTask.enums.CarColor;

public class WagonCar extends Car {

    public WagonCar(CarClass carClass, CarBrand carBrand, String carModel, CarColor carColor, int yearOfProduction,
                    int maxSpeed, double fuelConsumption, double carPrice) {
        super(carClass, carBrand, carModel, carColor, yearOfProduction, maxSpeed, fuelConsumption, carPrice);
    }

    @Override
    public int getCountOfDoors() {
        return 5;
    }
}