package ParkingLot;


public abstract class ParkingSpot {
    private int id;
    private boolean isSpotAvail;
    private VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getId() {
        return id;
    }

    public boolean isSpotAvail() {
        return isSpotAvail;
    }

    public VehicleType getvehicleType() {
        return vehicleType;
    }

    public ParkingSpot(int id, VehicleType vehicleType){
        this.id = id;
        this.isSpotAvail = true;
        this.vehicleType = vehicleType;
    }

    public void reserveSpot(Vehicle vehicle){
        this.isSpotAvail = false;
        this.parkedVehicle = vehicle;
    }

    public void freeSpot(){
        this.isSpotAvail = true;
        this.parkedVehicle = null;
    }
}
