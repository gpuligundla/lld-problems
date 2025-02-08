package RideSharingApp;

public abstract class Vehicle {
    protected String numPlate;

    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    public Vehicle(String numPlate){
        this.numPlate = numPlate;
    }
    public abstract double getFare();
}
