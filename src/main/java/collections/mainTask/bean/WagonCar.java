package collections.mainTask.bean;

import collections.mainTask.enums.CarBrand;
import collections.mainTask.enums.CarClass;
import collections.mainTask.enums.CarColor;

public class WagonCar extends Car {

    public WagonCar(CarClass carClass, CarBrand carBrand, String carModel, CarColor carColor, int yearOfProduction,
                    int maxSpeed, double fuelConsumption, double carPrice, int countOfDoors) {
        super(carClass, carBrand, carModel, carColor, yearOfProduction, maxSpeed, fuelConsumption, carPrice,
                countOfDoors);
    }

    @Override
    public boolean areThereRoofRails() {
        return true;
    }

    @Override
    public boolean isItPossibleToTransportOversizedCargo() {
        return true;
    }

    @Override
    public boolean areTheFrontSeatsQuickFolding() {
        return false;
    }

    @Override
    public boolean isTheLuggageCompartmentSeparatedFromTheSalon() {
        return false;
    }
}