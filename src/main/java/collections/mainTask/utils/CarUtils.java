package collections.mainTask.utils;

import collections.mainTask.bean.Car;
import collections.mainTask.bean.WagonCar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarUtils {

    private CarUtils() {
    }

    public static List<Car> allTaxiStationCars(List<Car> carList) {

        carList.forEach(System.out::print);
        return carList;
    }

    public static List<Car> costOfTaxiStationCars(List<Car> carList) {

        System.out.println(carList.stream().mapToDouble(Car::getCarPrice).sum() + " $");
        return carList;
    }

    public static List<Car> allCarsSortedByFuelConsumption(List<Car> carList) {

        carList.sort(Comparator.comparingDouble(Car::getFuelConsumption));
        carList.forEach(System.out::print);
        return carList;
    }

    public static List<Car> findCarsByRangeOfSpeed(List<Car> carList, int startOfRange, int endOfRange) {

        carList.stream().filter(car -> car.getMaxSpeed() > startOfRange && car.getMaxSpeed() < endOfRange)
                .collect(Collectors.toList()).forEach(System.out::print);
        return carList;
    }

    public static List<WagonCar> sortedByRoofRails(List<Car> carList) {

        List<WagonCar> wagonCars = carList.stream().filter(WagonCar.class::isInstance).map(WagonCar.class::cast)
                .collect(Collectors.toList());
        wagonCars.stream().filter(WagonCar::isAreThereRoofRails).collect(Collectors.toList())
                .forEach(System.out::print);
        return wagonCars;
    }
}