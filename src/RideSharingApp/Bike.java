package RideSharingApp;

public class Bike extends Vehicle{

    public Bike(String numPlate){
        super(numPlate);
    }

    @Override
    public double getFare() {
        return 10;
    }
}
