package Builder_pattern;// Cars for everyday usage like Sedan

public class DailyCar implements CarBuilder {
    private Car car = new Car();

    @Override
    public DailyCar setSeats(int seats) {
        car.setSeats(seats);  return this;
    }

    @Override
    public DailyCar setWheels(String wheels) {
        car.setWheels(wheels); return this;
    }

    @Override
    public DailyCar setEngine(String engine) {
        car.setEngine(engine); return this;
    }

    @Override
    public DailyCar setIsHasGPS(boolean hasGPS) {
        car.setIsHasGPS(hasGPS); return this   ;
    }

    @Override
    public Car build() {
        return car;
    }
}
