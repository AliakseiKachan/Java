package classes.mainTask.output;

import classes.mainTask.enums.CarBrand;
import classes.mainTask.bean.Car;
import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class OutputInformation {

    public void allCars(List<Car> carList) {

        System.out.println("There is a list of all cars in database: \n");

        carList.forEach(System.out::print);
        System.out.println();
    }

    public void CarsByCarBrand(List<Car> carList, CarBrand carBrand) {

        System.out.println("There is a list of cars of " + CarBrand.HYUNDAI + " brand: \n");

        carList.stream().filter(car -> car.getCarBrand().equals(carBrand)).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
    }

    public void CarsByCarModelAndUsedMoreNYears(List<Car> carList, String carModel, int valueYearsOfUse) {

        System.out.println("There is a list of " + carModel + " model that have been is use for more than " + valueYearsOfUse + " years: \n");

        carList.stream().filter(car -> car.getCarModel().equals(carModel) && Year.now().getValue() - car.getYearOfProduction() > valueYearsOfUse).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
    }

    public void CarsByYearOfProductionAndCarPrice(List<Car> carList, int yearOfProduction, int carPrice) {

        System.out.println("There is a list of cars of a " + yearOfProduction + " year of production, the price of which is higher than " + carPrice + " $: \n");

        carList.stream().filter(car -> car.getYearOfProduction() == yearOfProduction && car.getCarPrice() > carPrice).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
    }
}