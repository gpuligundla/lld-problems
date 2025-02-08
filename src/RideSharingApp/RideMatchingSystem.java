package RideSharingApp;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {
    private List<Passenger> passengerList = new ArrayList<>();
    private List<Driver> driverList = new ArrayList<>();

    public void addDriver(Driver driver){
        driverList.add(driver);
    }

    public void addPassenger(Passenger passenger){
        passengerList.add(passenger);
    }

    public void bookRide(Passenger passenger, Location destination, FareCalculatorStrategy faretype){
        if(driverList.isEmpty()){
            passenger.notify("No Drivers are available");
            return;
        }

        double distance = passenger.getLocation().calculateDistance(destination);

        Driver nearestDriver = getNearestDriver(passenger);
        driverList.remove(nearestDriver);
        passenger.notify("Driver "+ nearestDriver.getName() + " is on your way!!!");

        Ride ride = new Ride(passenger, nearestDriver, distance, faretype);

        ride.updateStatus(RideStatus.ONGOING);

        driverList.add(nearestDriver);
        ride.updateStatus(RideStatus.COMPLETED);
    }

    private Driver getNearestDriver(Passenger passenger){
        Driver nearestDriver = null;
        double minDist = Double.MAX_VALUE;

        for(Driver driver:driverList){
            double distance = driver.getLocation().calculateDistance(passenger.getLocation());
            if(minDist > distance){
                minDist = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }
}
