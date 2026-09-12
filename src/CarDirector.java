public class CarDirector {
    public Car makeDailyCar(CarBuilder builder) {
        builder.setSeats(4);
        builder.setWheels("Normal");
        builder.setEngine("Normal engine");
        builder.setIsHasGPS(true);

        return builder.build();
    }

    public Car makeSportCar(CarBuilder builder) {
        builder.setSeats(2);
        builder.setWheels("Sport wheels");
        builder.setEngine("Sport Engine");
        builder.setIsHasGPS(true);

        return builder.build();
    }
}
