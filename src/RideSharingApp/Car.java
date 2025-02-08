package RideSharingApp;

public class Car extends Vehicle{

    public Car(String numPlate){
        super(numPlate);
    }

    @Override
    public double getFare() {
        return 20;
    }
}
