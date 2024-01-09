package Devices;

public class Miracast implements Device{
    private boolean isActive;

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public String getContent() {
        return "I am a Miracast running on Android 14!";
    }
}
