package RideSharingApp;

public class Passenger extends User{

    public Passenger(String name, Location location){
        super(name, location);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Passenger Notification: "+ msg);
    }

}
