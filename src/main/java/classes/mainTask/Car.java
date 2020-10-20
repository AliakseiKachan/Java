package classes.mainTask;

public class Car {

    private String idVinNumber;
    private CarBrand carBrand;
    private String carModel;
    private int yearOfProduction;
    private CarColor carColor;
    private double carPrice;
    private String regNumber;

    public Car(String idVinNumber, CarBrand carBrand, String carModel) {
        this.idVinNumber = idVinNumber;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public Car(String idVinNumber, CarBrand carBrand, String carModel, int yearOfProduction, CarColor carColor, double carPrice, String regNumber) {
        this.idVinNumber = idVinNumber;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfProduction = yearOfProduction;
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.regNumber = regNumber;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\t");
        sb.append("idVinNumber = ").append(idVinNumber);
        sb.append(", carBrand = ").append(carBrand);
        sb.append(", carModel = ").append(carModel);
        sb.append(", yearOfProduction = ").append(yearOfProduction);
        sb.append(", carColor = ").append(carColor);
        sb.append(", carPrice = ").append(carPrice).append(" $");
        sb.append(", regNumber = ").append(regNumber);
        sb.append("\n");
        return sb.toString();
    }
}