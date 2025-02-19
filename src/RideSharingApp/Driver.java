package RideSharingApp;

public class Driver extends User{

    private Vehicle vehicle;

    public Driver(String name, Location location, Vehicle vehicle){
        super(name, location);
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void notify(String msg) {
        System.out.println("Driver Notification: "+ msg);
    }
}

