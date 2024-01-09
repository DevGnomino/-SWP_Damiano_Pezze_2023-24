package Devices;

public class AirPlay implements Device{
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
        return "I am an AirPlay Device running on IOS17!";
    }
}
