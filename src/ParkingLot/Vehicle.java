package ParkingLot;

enum VehicleType {
    CAR,
    BIKE,
    EV
}

public abstract class Vehicle {
    protected String numplate;
    protected VehicleType vehicleType;

    public Vehicle(String numplate, VehicleType type){
        this.numplate = numplate;
        this.vehicleType = type;
    }

    public String getNumplate() {
        return numplate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

}
