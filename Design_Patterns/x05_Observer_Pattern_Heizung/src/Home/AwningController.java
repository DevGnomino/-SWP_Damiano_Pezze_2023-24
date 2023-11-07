package Home;

public class AwningController implements Observer {
    @Override
    public void inform(float temperature) {
        System.out.println("I am an AwningController: " + temperature);
    }
}
