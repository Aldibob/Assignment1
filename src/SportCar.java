//  Cars like BMW M2 or M4

public class SportCar implements CarBuilder {
    private Car car = new Car();

    @Override
    public SportCar setSeats(int seats) {
        car.setSeats(seats); return this;
    }

    @Override
    public SportCar setWheels(String wheels) {
        car.setWheels(wheels); return this;
    }

    @Override
    public SportCar setEngine(String engine) {
        car.setEngine(engine); return this;
    }

    @Override
    public SportCar setIsHasGPS(boolean hasGPS) {
        car.setIsHasGPS(hasGPS); return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
