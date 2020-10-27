package collections.mainTask.database;

import collections.mainTask.bean.Car;
import collections.mainTask.bean.CoupeCar;
import collections.mainTask.bean.SedanCar;
import collections.mainTask.bean.WagonCar;
import collections.mainTask.enums.CarBrand;
import collections.mainTask.enums.CarClass;
import collections.mainTask.enums.CarColor;
import java.util.ArrayList;
import java.util.List;

public class TaxiStation {

    public List<Car> createDatabaseOfTaxiStation() {

       List<SedanCar> sedanCarsDatabase = new ArrayList<>();
       sedanCarsDatabase.add(new SedanCar(CarClass.B, CarBrand.VOLKSWAGEN, "POLO", CarColor.RED,
               2015, 198, 6.4, 7900.99, 4,
               true));
       sedanCarsDatabase.add(new SedanCar(CarClass.C, CarBrand.OPEL, "ASTRA", CarColor.YELLOW,
               2009, 201, 7.2, 6500.00, 4,
               true));
       sedanCarsDatabase.add(new SedanCar(CarClass.D, CarBrand.TOYOTA, "AVENSIS", CarColor.WHITE,
               2011, 217, 7.0, 8450.00, 4,
               true));
       sedanCarsDatabase.add(new SedanCar(CarClass.D, CarBrand.NISSAN, "TEANA", CarColor.ORANGE,
               2008, 210, 11.3, 6799.00, 4,
               true));
       sedanCarsDatabase.add(new SedanCar(CarClass.D, CarBrand.HYUNDAI, "SONATA", CarColor.PINK,
               2009, 215, 13.2, 6700.00, 4,
               true));
       sedanCarsDatabase.add(new SedanCar(CarClass.E, CarBrand.CADILLAC, "CTS", CarColor.CYAN,
               2014, 240, 11.2, 18500.00, 4,
               true));
       sedanCarsDatabase.add(new SedanCar(CarClass.F, CarBrand.ROLLS_ROYCE, "PHANTOM", CarColor.GRAY,
               2012, 260, 14.9, 130000.00, 4,
               true));

       List<CoupeCar> coupeCarsDatabase = new ArrayList<>();
       coupeCarsDatabase.add(new CoupeCar(CarClass.A, CarBrand.FORD, "KA", CarColor.PINK,
               2005, 174, 5.3, 3720.00, 2,
               true, true));
       coupeCarsDatabase.add(new CoupeCar(CarClass.B, CarBrand.HONDA, "CIVIC", CarColor.BLUE,
               1995, 182, 5.9, 2780.00, 2,
               true, true));
       coupeCarsDatabase.add(new CoupeCar(CarClass.C, CarBrand.BMW, "E46", CarColor.BLACK,
               2004, 220, 9.6, 5799.00, 2,
               true, true));
       coupeCarsDatabase.add(new CoupeCar(CarClass.E, CarBrand.LEXUS, "LC500", CarColor.RED,
               2017, 340, 13.5, 45000.00, 2,
               true, true));
       coupeCarsDatabase.add(new CoupeCar(CarClass.E, CarBrand.MERSEDES_BENZ, "C207", CarColor.ORANGE,
               2014, 280, 11.7, 18500.00, 2,
               true, true));
       coupeCarsDatabase.add(new CoupeCar(CarClass.F, CarBrand.JAGUAR, "F-TYPE", CarColor.CYAN,
               2014, 315, 13.7, 24600.00, 2,
               true, true));

       List<Car> taxiStationDatabase = new ArrayList<>();
       taxiStationDatabase.addAll(sedanCarsDatabase);
       taxiStationDatabase.addAll(coupeCarsDatabase);
       taxiStationDatabase.addAll(createDatabaseOfWagonCars());

       return taxiStationDatabase;
    }

    public List<WagonCar> createDatabaseOfWagonCars() {
       List<WagonCar> wagonCarsDatabase = new ArrayList<>();
       wagonCarsDatabase.add(new WagonCar(CarClass.C, CarBrand.KIA, "CEED", CarColor.GREEN,
               2016, 205, 6.6, 12200.00, 5,
               false, true));
       wagonCarsDatabase.add(new WagonCar(CarClass.C, CarBrand.PEUGEOT, "406", CarColor.BLUE,
               2002, 198, 9.4, 4200.00, 5,
               true, true));
       wagonCarsDatabase.add(new WagonCar(CarClass.C, CarBrand.FORD, "FOCUS", CarColor.BLACK,
               2007, 201, 7.8, 6500.00, 5,
               true, true));
       wagonCarsDatabase.add(new WagonCar(CarClass.D, CarBrand.BMW, "E39", CarColor.WHITE,
               2003, 260, 8.8, 5600.00, 5,
               false, true));

       return wagonCarsDatabase;
    }
}