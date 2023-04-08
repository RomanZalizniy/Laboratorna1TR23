public class Zavd4 {
    public static void main(String[] args) {
        Car car1 = new Car(150, 2.0, "Toyota", "Corolla", 2010, false);
        Car car2 = new Car(180, 2.5, "Honda", "Accord", 2015, false);
        Car car3 = new Car(200, 3.0, "BMW", "X5", 2018, false);
        Car car4 = new Car(80, 1.0, "Smart", "Fortwo", 2012, true);
        Car car5 = new Car(70, 1.2, "Fiat", "500", 2010, false);
        Car car6 = new Car(120, 1.6, "Volkswagen", "Golf", 2014, false);
        Car car7 = new Car(100, 1.4, "Opel", "Astra", 2016, false);
        Car car8 = new Car(130, 1.8, "Mazda", "CX-5", 2019, false);
        Car car9 = new Car(90, 1.3, "Suzuki", "Swift", 2013, false);
        Car car10 = new Car(110, 1.5, "Hyundai", "Elantra", 2017, false);

        double engineCapacitySum = car1.getEngineCapacity() + car2.getEngineCapacity() + car3.getEngineCapacity() +
                car4.getEngineCapacity() + car5.getEngineCapacity() + car6.getEngineCapacity() + car7.getEngineCapacity() +
                car8.getEngineCapacity() + car9.getEngineCapacity() + car10.getEngineCapacity();
        System.out.println("Sum of engine capacities: " + engineCapacitySum);

        int horsepowerSum = car1.getHorsepower() + car2.getHorsepower() + car3.getHorsepower() +
                car4.getHorsepower() + car5.getHorsepower() + car6.getHorsepower() + car7.getHorsepower() +
                car8.getHorsepower() + car9.getHorsepower() + car10.getHorsepower();
        System.out.println("Sum of horsepower: " + horsepowerSum);
    }
}



