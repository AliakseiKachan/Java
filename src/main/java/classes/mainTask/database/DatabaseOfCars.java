package classes.mainTask.database;

import classes.mainTask.enums.CarBrand;
import classes.mainTask.enums.CarColor;
import classes.mainTask.bean.Car;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOfCars {

    public List<Car> createDatabaseOfCars() {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("1VBX1215COP", CarBrand.HYUNDAI, "SONATA", 2009, CarColor.CYAN, 6500.50, "1126KX5"));

        carList.add(new Car("2GTH4587PRG", CarBrand.HYUNDAI, "GRANDEUR", 2006, CarColor.GREEN, 5700.65, "2354BX3"));

        carList.add(new Car("3NNX5469IUX", CarBrand.HYUNDAI, "SOLARIS", 2015, CarColor.BLUE, 7800.00, "2209AP7"));

        carList.add(new Car("4GGT7688UTR", CarBrand.TOYOTA, "AVALON", 2005, CarColor.ORANGE, 9399.99, "2365PP1"));

        carList.add(new Car("5TXC8741OOP", CarBrand.TOYOTA, "CAMRY", 2003, CarColor.GRAY, 5315.00, "5149EH6"));

        carList.add(new Car("6RTE7658VBF", CarBrand.TOYOTA, "TUNDRA", 2009, CarColor.BLACK, 12490.00, "7777XX7"));

        carList.add(new Car("7PIK8809MNB", CarBrand.KIA, "MAGENTIS", 2000, CarColor.YELLOW, 3450.00, "5151II5"));

        carList.add(new Car("8OIJ7732LNV", CarBrand.KIA, "SPORTAGE", 2007, CarColor.RED, 6350.00, "2364KP5"));

        carList.add(new Car("9PKK8861BCZ", CarBrand.KIA, "RIO", 2017, CarColor.PINK, 9999.99, "6655TT7"));

        carList.add(new Car("10JGJ7798PJ", CarBrand.BMW, "X6", 2016, CarColor.WHITE, 35699.00, "9999HH7"));

        carList.add(new Car("11GFT6613NB", CarBrand.BMW, "E38", 1998, CarColor.BLUE, 3150.00, "9844HB3"));

        carList.add(new Car("12LLK6008VC", CarBrand.BMW, "X5", 2011, CarColor.BLACK, 12399.00, "6667PP6"));

        carList.add(new Car("13YRT7666BB", CarBrand.MERCEDES, "S220", 2001, CarColor.WHITE, 4560.00, "5789KK5"));

        carList.add(new Car("14UUY7332MJ", CarBrand.MERCEDES, "E211", 2009, CarColor.GRAY, 6790, "6644OH6"));

        carList.add(new Car("15UUH5634BE", CarBrand.MERCEDES, "S140", 1997, CarColor.GREEN, 3550.00, "2268AA5"));

        carList.add(new Car("16IPL7611VV", CarBrand.VW, "GOLF", 2004, CarColor.BLUE, 4750.00, "8243MM4"));

        carList.add(new Car("17IKL8900VC", CarBrand.VW, "PASSAT", 2010, CarColor.GRAY, 6790.00, "1122KK5"));

        carList.add(new Car("18JJG7752CX", CarBrand.VW, "TOUAREG", 2012, CarColor.ORANGE, 8770.00, "5555CC7"));

        carList.add(new Car("19PKK7754MN", CarBrand.AUDI, "A6", 1996, CarColor.WHITE, 3240.00, "6261HH3"));

        carList.add(new Car("20IKH8119GT", CarBrand.AUDI, "Q7", 2014, CarColor.CYAN, 11540.00, "9977XX7"));

        carList.add(new Car("21YYT6653FD", CarBrand.AUDI, "A8", 2002, CarColor.GRAY, 6799.00, "6565II2"));

        return carList;
    }
}