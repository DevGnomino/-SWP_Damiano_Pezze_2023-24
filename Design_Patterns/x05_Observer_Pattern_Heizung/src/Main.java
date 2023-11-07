import Home.AwningController;
import Home.HeatController;
import Home.Thermometer;

public class Main {
    public static void main(String[] args) {
        HeatController heatController = new HeatController();
        AwningController awningController = new AwningController();

        Thermometer thermometer = new Thermometer();
        thermometer.addObserver(heatController);
        thermometer.addObserver(awningController);

        for (int i = 0; i <= 10; i++){
            thermometer.setTemp();
        }

    }
}
