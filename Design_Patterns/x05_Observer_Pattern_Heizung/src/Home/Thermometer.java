package Home;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Thermometer {
    private float temperature;
    private List<Observer> observers;
    private Random rand;

    public Thermometer() {
        this.observers = new ArrayList<Observer>();
        rand = new Random();
        setTemp();
    }

    public void setTemp(){
        this.temperature = rand.nextInt(40) + rand.nextFloat();
        if (this.temperature >= 20){
            informAll();
        }
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    private void informAll(){
        for (Observer observer:observers) {
            observer.inform(this.temperature);
        }
    }
}
