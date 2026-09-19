package Builder_pattern;// All concrete builders would implement this interface

public interface CarBuilder {
    CarBuilder setSeats(int seats);
    CarBuilder setWheels(String wheels);
    CarBuilder setEngine(String engine);
    CarBuilder setIsHasGPS(boolean hasGPS);
    Car build();
}
