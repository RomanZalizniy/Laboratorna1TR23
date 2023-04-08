public class Car {
    private int horsepower;
    private double engineCapacity;
    private String brand;
    private String model;
    private int year;
    private boolean isElectric;

    // конструктор класу
    public Car(int horsepower, double engineCapacity, String brand, String model, int year, boolean isElectric) {
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }

    // геттери і сеттери для всіх полів

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
