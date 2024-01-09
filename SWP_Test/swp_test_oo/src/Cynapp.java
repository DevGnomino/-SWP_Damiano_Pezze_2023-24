import Devices.Device;

import java.util.ArrayList;
import java.util.List;

public class Cynapp {
    Beamer myBeamer = new Beamer();
    List<Device> devices = new ArrayList<Device>();

    public void addDevice(Device device){
        if (this.devices.size() < 4){
            this.devices.add(device);
        } else {
            System.out.println("Device removed: " + this.devices.get(3));
            this.devices.remove(3);
            this.devices.add(device);
        }

        System.out.println("Added new Device: " + device);
    }

    public void setActive(int deviceIndex){
        try {
            this.devices.get(deviceIndex).setActive(true);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void showDevice(int deviceIndex){
        try {
            myBeamer.show(this.devices.get(deviceIndex).getContent());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
