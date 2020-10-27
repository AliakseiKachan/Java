package collections.mainTask.bean;

import collections.mainTask.enums.CarBrand;
import collections.mainTask.enums.CarClass;
import collections.mainTask.enums.CarColor;

public class CoupeCar extends  Car {

    private boolean areTheFrontSeatsQuickFolding;
    private boolean isTheLuggageCompartmentSeparatedFromTheSalon;

    public CoupeCar(CarClass carClass, CarBrand carBrand, String carModel, CarColor carColor, int yearOfProduction,
                    int maxSpeed, double fuelConsumption, double carPrice, int countOfDoors,
                    boolean areTheFrontSeatsQuickFolding, boolean isTheLuggageCompartmentSeparatedFromTheSalon) {
        super(carClass, carBrand, carModel, carColor, yearOfProduction, maxSpeed, fuelConsumption, carPrice,
                countOfDoors);
        this.areTheFrontSeatsQuickFolding = areTheFrontSeatsQuickFolding;
        this.isTheLuggageCompartmentSeparatedFromTheSalon = isTheLuggageCompartmentSeparatedFromTheSalon;
    }

    public boolean isAreTheFrontSeatsQuickFolding() {
        return areTheFrontSeatsQuickFolding;
    }

    public void setAreTheFrontSeatsQuickFolding(boolean areTheFrontSeatsQuickFolding) {
        this.areTheFrontSeatsQuickFolding = areTheFrontSeatsQuickFolding;
    }

    public boolean isTheLuggageCompartmentSeparatedFromTheSalon() {
        return isTheLuggageCompartmentSeparatedFromTheSalon;
    }

    public void setTheLuggageCompartmentSeparatedFromTheSalon(boolean theLuggageCompartmentSeparatedFromTheSalon) {
        isTheLuggageCompartmentSeparatedFromTheSalon = theLuggageCompartmentSeparatedFromTheSalon;
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
        sb.append(", areTheFrontSeatsQuickFolding=").append(isAreTheFrontSeatsQuickFolding());
        sb.append(", isTheLuggageCompartmentSeparatedFromTheSalon=").append(isTheLuggageCompartmentSeparatedFromTheSalon());
        sb.append("\n");
        return sb.toString();
    }
}