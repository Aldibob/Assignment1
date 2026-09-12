public class CarDirector {

    // method for Daily cars
    public Car makeDailyCar(CarBuilder builder) {
        builder.setSeats(4);
        builder.setWheels("Normal");
        builder.setEngine("Normal engine");
        builder.setIsHasGPS(true);

        return builder.build();
    }

    //method for Sport cars
    public Car makeSportCar(CarBuilder builder) {
        builder.setSeats(2);
        builder.setWheels("Sport wheels");
        builder.setEngine("Sport Engine");
        builder.setIsHasGPS(true);

        return builder.build();
    }
}
