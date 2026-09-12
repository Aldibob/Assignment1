public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new DailyCar();
        Car car = director.makeDailyCar(builder);
        System.out.print(car.getWheels());
    }
}