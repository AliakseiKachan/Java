package classes.mainTask;

import classes.mainTask.database.DatabaseOfCars;
import classes.mainTask.enums.CarBrand;
import classes.mainTask.output.OutputInformation;

/**
 *      Create classes, the specifications of which are given below.
 *      Define constructors and methods setType (), getType (), toString ().
 *      Define additional methods in the class that creates an array of objects.
 *      Set the criteria for selecting data and display this data on the console.
 *      Each class with information must declare several constructors.
 *
 *      8. Car: id, Brand, Model, Year of manufacture, Color, Price, Registration number.
 *      Create an array of objects. Output:
 *      a) a list of cars of a given brand;
 *      b) a list of cars of a given model that have been in use for more than n years;
 *      c) a list of cars of a given year of manufacture, the price of which is higher than the indicated one.
 */

public class MainTask {

    public static void main(String[] args) {

        DatabaseOfCars databaseOfCars = new DatabaseOfCars();
        OutputInformation outputInformation = new OutputInformation(databaseOfCars.createDatabaseOfCars());

        outputInformation.allCars();

        outputInformation.CarsByCarBrand(CarBrand.HYUNDAI);

        outputInformation.CarsByCarModelAndUsedMoreNYears("PASSAT", 7);

        outputInformation.CarsByYearOfProductionAndCarPrice(2009, 3000);
    }
}