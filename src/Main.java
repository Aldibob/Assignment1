public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector(); // created director
        CarBuilder builder = new DailyCar(); // created builder
        Car car = director.makeDailyCar(builder); // Building Daily car
        System.out.print(car.getWheels() + "\n");
        System.out.print(car.isHasGPS());
    }
}