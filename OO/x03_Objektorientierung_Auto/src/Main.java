import Packages.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Volvo";
        c1.fuelConsumption = 6;
        c1.fuelAmount = 30;
        c1.fuelMaxAmount = 85;
        c1.serialNumber = "V1234";

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 8;
        c2.fuelAmount = 70;
        c2.fuelMaxAmount = 80;
        c2.serialNumber = "M1234";

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

    }
}