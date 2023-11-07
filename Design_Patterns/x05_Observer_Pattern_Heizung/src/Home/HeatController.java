package Home;

public class HeatController implements Observer{
    @Override
    public void inform(float temperature) {
        System.out.println("I am a HeatController: " + temperature);
    }
}
