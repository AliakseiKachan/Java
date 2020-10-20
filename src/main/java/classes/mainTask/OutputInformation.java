package classes.mainTask;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class OutputInformation {

    public static void getCarsByCarBrand(List<Car> carList, CarBrand carBrand) {

        System.out.println("There is a list of cars of " + CarBrand.HYUNDAI + " brand: \n");

        List<Car> carsByCarBrand = new ArrayList<>();

        for (Car car : carList) {
            if (car.getCarBrand().equals(carBrand)) {
                carsByCarBrand.add(car);
            }
        }
        System.out.println(carsByCarBrand.toString());
    }

    public static void getCarsByCarModelAndUsedMoreNYears(List<Car> carList, String carModel, int valueYearsOfUse) {

        System.out.println("There is a list of " + carModel + " model that have been is use for more than " + valueYearsOfUse + " years: \n");

        List<Car> carsByCarModelAndUsedMoreNYears = new ArrayList<>();

        for (Car car : carList) {
            if (car.getCarModel().equals(carModel) && Year.now().getValue() - car.getYearOfProduction() > valueYearsOfUse) {
                carsByCarModelAndUsedMoreNYears.add(car);
            }
        }
        System.out.println(carsByCarModelAndUsedMoreNYears.toString());
    }

    public static void getCarsByYearOfProductionAndCarPrice(List<Car> carList, int yearOfProduction, int carPrice) {

        System.out.println("There is a list of cars of a " + yearOfProduction + " year of production, the price of which is higher than " + carPrice + " $: \n");

        List<Car> carsByYearOfProductionAndCarPrice = new ArrayList<>();

        for (Car car : carList) {
            if (car.getYearOfProduction() == yearOfProduction && car.getCarPrice() > carPrice) {
                carsByYearOfProductionAndCarPrice.add(car);
            }
        }
        System.out.println(carsByYearOfProductionAndCarPrice.toString());
    }
}