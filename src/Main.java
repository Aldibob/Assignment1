public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector(); // created director
        Car car = director.makeDailyCar(new DailyCar()); // Building Daily car

        System.out.print(car.getWheels() + "\n");
        System.out.print(car.isHasGPS());
    }
}