public class CarDirector {

    // method for Daily cars
    public Car makeDailyCar(CarBuilder builder) {
        return builder
                .setSeats(4)
                .setWheels("Normal")
                .setEngine("Normal engine")
                .setIsHasGPS(true)
                .build();
    }

    //method for Sport cars
    public Car makeSportCar(CarBuilder builder) {
        return builder
                .setSeats(2)
                .setWheels("Sport wheels")
                .setEngine("Sport engine")
                .setIsHasGPS(true)
                .build();
    }
}
