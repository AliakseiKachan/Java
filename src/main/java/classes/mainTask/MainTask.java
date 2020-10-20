package classes.mainTask;

/**
 *      Создать классы, спецификации которых приведены ниже.
 *      Определить конструкторы и методы setТип(), getТип(), toString().
 *      Определить дополнительно методы в классе, создающем массив объектов.
 *      Задать критерий выбора данных и вывести эти данные на консоль.
 *      В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 *
 *      8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 *      Создать массив объектов. Вывести:
 *      a) список автомобилей заданной марки;
 *      b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
 *      c) список автомобилей заданного года выпуска, цена которых больше указанной.
 */

public class MainTask {

    public static void main(String[] args) {

        System.out.println("There is a list of all cars in database: \n\n" + DatabaseOfCars.createDatabaseOfCars().toString());

        OutputInformation.getCarsByCarBrand(DatabaseOfCars.createDatabaseOfCars(), CarBrand.HYUNDAI);

        OutputInformation.getCarsByCarModelAndUsedMoreNYears(DatabaseOfCars.createDatabaseOfCars(), "PASSAT", 7);

        OutputInformation.getCarsByYearOfProductionAndCarPrice(DatabaseOfCars.createDatabaseOfCars(), 2009, 3000);
    }
}