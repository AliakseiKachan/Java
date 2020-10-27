package collections.mainTask.bean;

import collections.mainTask.enums.CarBrand;
import collections.mainTask.enums.CarClass;
import collections.mainTask.enums.CarColor;

public class Car {

    private CarClass carClass;
    private CarBrand carBrand;
    private String carModel;
    private CarColor carColor;
    private int yearOfProduction;
    private int maxSpeed;
    private double fuelConsumption;
    private double carPrice;
    private int countOfDoors;

    public Car(CarClass carClass, CarBrand carBrand, String carModel, CarColor carColor, int yearOfProduction,
               int maxSpeed, double fuelConsumption, double carPrice, int countOfDoors) {
        this.carClass = carClass;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carColor = carColor;
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.carPrice = carPrice;
        this.countOfDoors = countOfDoors;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("carClass=").append(carClass);
        sb.append(", carBrand=").append(carBrand);
        sb.append(", carModel='").append(carModel).append('\'');
        sb.append(", carColor=").append(carColor);
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append(", countOfDoors=").append(getCountOfDoors());
        sb.append(", maxSpeed=").append(maxSpeed).append(" km/h");
        sb.append(", fuelConsumption=").append(fuelConsumption).append(" l/100km");
        sb.append(", carPrice=").append(carPrice).append(" $");
        sb.append("\n");
        return sb.toString();
    }
}