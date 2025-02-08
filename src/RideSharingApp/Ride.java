package RideSharingApp;

enum RideStatus{
    SCHEDULED, ONGOING, COMPLETED;
}

public class Ride {
    private Passenger passenger;
    private Driver driver;
    private double distance;
    private FareCalculatorStrategy strategy;
    private double fare;
    private RideStatus status;

    public Ride(Passenger passenger, Driver driver, double distance, FareCalculatorStrategy strategy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.strategy = strategy;
        this.status = RideStatus.SCHEDULED;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void setStatus(RideStatus status) {
        this.status = status;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void calculateFare(){
        this.fare = strategy.calculate(driver.getVehicle(), distance);
    }

    public void updateStatus(RideStatus status){
        this.status = status;
        notifyUsers();
    }

    private void notifyUsers(){
        passenger.notify("Your Ride status: " + status);
        driver.notify("Your Ride Status: "+ status);
    }

}
