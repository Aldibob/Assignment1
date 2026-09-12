public class CarDirector {
    public Car makeDailyCar(CarBuilder builder) {
        builder.setSeats(4);
        builder.setWheels("Normal");
        builder.setEngine("Normal engine");
        builder.setIsHasGPS(true);

        return builder.build();
    }


}
