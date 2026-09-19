package factory;

public class HondaFactory extends VehicleFactory{
    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new HondaMotorcycle();
    }
}
