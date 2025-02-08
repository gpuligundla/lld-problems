package RideSharingApp;

public class Main {
    public static void main(String[] args) {
        Location loc1 = new Location(1.23, 2.5);
        Location loc2 = new Location(11.3, 21);
        Location loc3 = new Location(2.4, 2.5);

        Driver driver1 = new Driver("Subhash", loc1, new Car("AP"));
        Driver driver2 = new Driver("Datta", loc2, new Car("GG"));
        Driver driver3 = new Driver("Utkal", loc1, new Car("RH"));

        Passenger passenger1 = new Passenger("GK", loc1);

        RideMatchingSystem system = new RideMatchingSystem();

        system.addDriver(driver1);
        system.addDriver(driver2);
        system.addDriver(driver3);

        system.addPassenger(passenger1);

        system.bookRide(passenger1, loc3, new Luxury());
    }
}
