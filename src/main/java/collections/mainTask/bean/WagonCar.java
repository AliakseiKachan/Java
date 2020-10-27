package collections.mainTask.bean;

import collections.mainTask.enums.CarBrand;
import collections.mainTask.enums.CarClass;
import collections.mainTask.enums.CarColor;

public class WagonCar extends Car {

    private boolean areThereRoofRails;
    private boolean isItPossibleToTransportOversizedCargo;

    public WagonCar(CarClass carClass, CarBrand carBrand, String carModel, CarColor carColor, int yearOfProduction,
                    int maxSpeed, double fuelConsumption, double carPrice, int countOfDoors,
                    boolean areThereRoofRails, boolean isItPossibleToTransportOversizedCargo) {
        super(carClass, carBrand, carModel, carColor, yearOfProduction, maxSpeed, fuelConsumption, carPrice,
                countOfDoors);
        this.areThereRoofRails = areThereRoofRails;
        this.isItPossibleToTransportOversizedCargo = isItPossibleToTransportOversizedCargo;
    }

    public boolean isAreThereRoofRails() {
        return areThereRoofRails;
    }

    public void setAreThereRoofRails(boolean areThereRoofRails) {
        this.areThereRoofRails = areThereRoofRails;
    }

    public boolean isItPossibleToTransportOversizedCargo() {
        return isItPossibleToTransportOversizedCargo;
    }

    public void setItPossibleToTransportOversizedCargo(boolean itPossibleToTransportOversizedCargo) {
        isItPossibleToTransportOversizedCargo = itPossibleToTransportOversizedCargo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("carClass=").append(getCarClass());
        sb.append(", carBrand=").append(getCarBrand());
        sb.append(", carModel='").append(getCarModel()).append('\'');
        sb.append(", carColor=").append(getCarColor());
        sb.append(", yearOfProduction=").append(getYearOfProduction());
        sb.append(", countOfDoors=").append(getCountOfDoors());
        sb.append(", maxSpeed=").append(getMaxSpeed()).append(" km/h");
        sb.append(", fuelConsumption=").append(getFuelConsumption()).append(" l/100km");
        sb.append(", carPrice=").append(getCarPrice()).append(" $");
        sb.append(", areThereRoofRails=").append(isAreThereRoofRails());
        sb.append(", isItPossibleToTransportOversizedCargo=").append(isItPossibleToTransportOversizedCargo());
        sb.append("\n");
        return sb.toString();
    }
}