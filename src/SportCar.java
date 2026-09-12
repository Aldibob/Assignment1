//  Cars like BMW M2 or M4

public class SportCar implements CarBuilder {
    private Car car = new Car();

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setWheels(String wheels) {
        car.setWheels(wheels);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setIsHasGPS(boolean hasGPS) {
        car.setIsHasGPS(hasGPS);
    }

    @Override
    public Car build() {
        return car;
    }
}
