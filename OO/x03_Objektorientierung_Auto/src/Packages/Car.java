package Packages;

public class Car {
    //Instanz / Gedächtnisvariablen

    //public sollte man später nicht mehr verwenden!
    public int fuelConsumption;
    public int fuelAmount;
    public int fuelMaxAmount;
    public String brand;
    public String serialNumber;
    public String color;

    public void drive() {
        this.fuelAmount -= this.fuelConsumption;
        System.out.println("I am driving!");
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        float percentualAmount = (float)this.fuelAmount / (float)this.fuelMaxAmount;
        if (percentualAmount > 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        System.out.println("Die Restreichweite beträgt "+ (float)this.fuelAmount/(float)this.fuelConsumption);
    }

}
}
