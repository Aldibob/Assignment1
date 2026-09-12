public interface CarBuilder {
    void setSeats(int seats);
    void setWheels(String wheels);
    void setEngine(String engine);
    void setIsHasGPS(boolean hasGPS);
    Car build();
}
