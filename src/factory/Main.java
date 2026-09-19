package factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory bmwFactory = new BMWFactory();
        Car bmw5 =  bmwFactory.createCar();
        Motorcycle bmwF450GS = bmwFactory.createMotorcycle();
        bmw5.startCar();
        bmwF450GS.startMotorCycle();


    }
}
