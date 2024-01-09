import Devices.AirPlay;
import Devices.Miracast;

public class Main {
    public static void main(String[] args) {
        Cynapp myCynapp = new Cynapp();

        myCynapp.addDevice(new AirPlay());
        myCynapp.addDevice(new Miracast());
        myCynapp.addDevice(new AirPlay());
        myCynapp.addDevice(new AirPlay());


        myCynapp.setActive(1);
        myCynapp.showDevice(1);
        myCynapp.showDevice(2);
        myCynapp.addDevice(new Miracast());
    }
}