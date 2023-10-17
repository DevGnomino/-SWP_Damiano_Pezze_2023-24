package Components;

public class Phone {
    private String color;
    private Sim sim;
    private Camera camera;
    private SDcard sdcard;

    public Phone(String color, Sim sim, Camera camera, SDcard sdcard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdcard = sdcard;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void setSdcard(SDcard sdcard) {
        this.sdcard = sdcard;
    }

    public void takePicture(){

    }

    public void makeCall(String person){

    }

    public int getFreeSpace(){

        return 0;
    }

    public void printAllFiles(){

    }
}
