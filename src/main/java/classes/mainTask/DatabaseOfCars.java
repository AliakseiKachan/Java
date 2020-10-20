package classes.mainTask;

import java.util.Arrays;
import java.util.List;

public class DatabaseOfCars {

    static List<Car> createDatabaseOfCars() {

        Car car1 = new Car("1VBX1215COP", CarBrand.HYUNDAI, "SONATA");
        car1.setYearOfProduction(2009);
        car1.setCarColor(CarColor.CYAN);
        car1.setCarPrice(6500.50);
        car1.setRegNumber("1125KX5");

        Car car2 = new Car("2GTH4587PRG", CarBrand.HYUNDAI, "GRANDEUR");
        car2.setYearOfProduction(2006);
        car2.setCarColor(CarColor.GREEN);
        car2.setCarPrice(5700.65);
        car2.setRegNumber("2354BX3");

        Car car3 = new Car("3NNX5469IUX", CarBrand.HYUNDAI, "SOLARIS");
        car3.setYearOfProduction(2015);
        car3.setCarColor(CarColor.BLUE);
        car3.setCarPrice(7800.00);
        car3.setRegNumber("2209AP7");

        Car car4 = new Car("4GGT7688UTR", CarBrand.TOYOTA, "AVALON");
        car4.setYearOfProduction(2005);
        car4.setCarColor(CarColor.ORANGE);
        car4.setCarPrice(9399.99);
        car4.setRegNumber("2365PP1");

        Car car5 = new Car("5TXC8741OOP", CarBrand.TOYOTA, "CAMRY");
        car5.setYearOfProduction(2003);
        car5.setCarColor(CarColor.GRAY);
        car5.setCarPrice(5315.00);
        car5.setRegNumber("5149EH6");

        Car car6 = new Car("6RTE7658VBF", CarBrand.TOYOTA, "TUNDRA");
        car6.setYearOfProduction(2009);
        car6.setCarColor(CarColor.BLACK);
        car6.setCarPrice(12490.00);
        car6.setRegNumber("7777XX7");

        Car car7 = new Car("7PIK8809MNB", CarBrand.KIA, "MAGENTIS", 2000, CarColor.YELLOW, 3450.00, "5151II5");

        Car car8 = new Car("8OIJ7732LNV", CarBrand.KIA, "SPORTAGE", 2007, CarColor.RED, 6350.00, "2364KP5");

        Car car9 = new Car("9PKK8861BCZ", CarBrand.KIA, "RIO", 2017, CarColor.PINK, 9999.99, "6655TT7");

        Car car10 = new Car("10JGJ7798PJ", CarBrand.BMW, "X6", 2016, CarColor.WHITE, 35699.00, "9999HH7");

        Car car11 = new Car("11GFT6613NB", CarBrand.BMW, "E38", 1998, CarColor.BLUE, 3150.00, "9844HB3");

        Car car12 = new Car("12LLK6008VC", CarBrand.BMW, "X5", 2011, CarColor.BLACK, 12399.00, "6667PP6");

        Car car13 = new Car("13YRT7666BB", CarBrand.MERCEDES, "S220", 2001, CarColor.WHITE, 4560.00, "5789KK5");

        Car car14 = new Car("14UUY7332MJ", CarBrand.MERCEDES, "E211", 2009, CarColor.GRAY, 6790, "6644OH6");

        Car car15 = new Car("15UUH5634BE", CarBrand.MERCEDES, "S140", 1997, CarColor.GREEN, 3550.00, "2268AA5");

        Car car16 = new Car("16IPL7611VV", CarBrand.VW, "GOLF", 2004, CarColor.BLUE, 4750.00, "8243MM4");

        Car car17 = new Car("17IKL8900VC", CarBrand.VW, "PASSAT", 2010, CarColor.GRAY, 6790.00, "1122KK5");

        Car car18 = new Car("18JJG7752CX", CarBrand.VW, "TOUAREG", 2012, CarColor.ORANGE, 8770.00, "5555CC7");

        Car car19 = new Car("19PKK7754MN", CarBrand.AUDI, "A6", 1996, CarColor.WHITE, 3240.00, "6261HH3");

        Car car20 = new Car("20IKH8119GT", CarBrand.AUDI, "Q7", 2014, CarColor.CYAN, 11540.00, "9977XX7");

        Car car21 = new Car("21YYT6653FD", CarBrand.AUDI, "A8", 2002, CarColor.GRAY, 6799.00, "6565II2");

        List<Car> carList = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15, car16, car17, car18, car19, car20, car21);

        return carList;
    }
}