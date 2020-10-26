package collections.mainTask;

import collections.mainTask.output.OutputMethods;
import collections.mainTask.database.TaxiStation;

/**
 * The task. Create a console application that meets the following requirements:
 *
 * Each class should have a meaningful name and informative composition.
 * Use OOP features: classes, inheritance, polymorphism, encapsulation.
 * Inheritance should only be applied when it makes sense.
 * When coding, the java code convention must be used.
 * Classes must be properly packaged.
 * The console menu should be minimal.
 * Files can be used to store initialization parameters.
 *
 * Taxi station. Determine the hierarchy of cars. Create a taxi station.
 * Calculate the cost of the vehicle fleet.
 * Sort vehicles in the fleet by fuel consumption.
 * Find a car in the company that matches a given range of speed parameters.
 */

public class Main {

    public static void main(String[] args) {

        TaxiStation taxiStation = new TaxiStation();
        OutputMethods outputMethods = new OutputMethods(taxiStation.createDatabaseOfTaxiStation());

        outputMethods.allTaxiStationCars();
        outputMethods.costOfTaxiStationCars();
        outputMethods.allCarsSortedByFuelConsumption();
        outputMethods.findCarsByRangeOfSpeed(250, 300);
    }
}