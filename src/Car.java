public class Car {

    private int seats;
    private String wheels;
    private String engine;
    private boolean hasGPS;

    //Getters and setters

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setIsHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public int getSeats() {
        return seats;
    }

    public String getWheels() {
        return wheels + "\n";
    }

    public String getEngine() {
        return engine;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }
}
