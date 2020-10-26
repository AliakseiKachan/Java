package collections.mainTask.utils;

import collections.mainTask.bean.Car;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    private List<Car> taxiStationList;

    public Utils(List<Car> taxiStationList) {
        this.taxiStationList = taxiStationList;
    }

    public void allTaxiStationCars() {

        System.out.println("There is a list of all cars in taxi station: \n");

        taxiStationList.forEach(System.out::print);
        System.out.println();
    }

    public void costOfTaxiStationCars() {

        System.out.print("The summary cost of all taxi station cars is: ");

        System.out.println(taxiStationList.stream().mapToDouble(Car::getCarPrice).sum() + " $");
        System.out.println();
    }

    public void allCarsSortedByFuelConsumption() {

        System.out.println("There is a list of all cars in taxi station sorted by fuel consumption: \n");

        taxiStationList.sort(Comparator.comparingDouble(Car::getFuelConsumption));
        taxiStationList.forEach(System.out::print);
        System.out.println();
    }

    public void findCarsByRangeOfSpeed(int startOfRange, int endOfRange) {

        System.out.println("There is a list of cars which max speed is in range from " + startOfRange + " to "
                + endOfRange + ":\n");

        taxiStationList.stream().filter(car -> car.getMaxSpeed() > startOfRange && car.getMaxSpeed() < endOfRange)
                .collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
    }

    public void sortedCarsByHavingRailsOnRoof() {

        System.out.println("There is a list of cars with rails on roof:\n");

        taxiStationList.stream().filter(Car::areThereRoofRails).collect(Collectors.toList()).forEach(System.out::print);
    }
}