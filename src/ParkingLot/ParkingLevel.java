package ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ParkingLevel {
    public int getLevelID() {
        return levelID;
    }

    private int levelID;
    private List<ParkingSpot> parkingSpots;

    public ParkingLevel(int id){
        this.levelID = id;
        parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot spot){
        parkingSpots.add(spot);
    }

    public void displayLevelStats(){
        int totalSpots = 0, bikeAvailSpots = 0, carAvailSpots = 0, EVAvailSpots = 0;

        totalSpots = parkingSpots.size();
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.getvehicleType().equals(VehicleType.BIKE)){
                bikeAvailSpots += 1;
            } else if (parkingSpot.getvehicleType().equals(VehicleType.CAR)) {
                carAvailSpots += 1;
            }
            else{
                EVAvailSpots += 1;
            }
        }
        System.out.println("Stats of Level:" + levelID);
        System.out.println("Total number of parking spots are: " + totalSpots);
        System.out.println("Available Bike parking spots are: " + bikeAvailSpots);
        System.out.println("Available Car parking spots are: " + carAvailSpots);
        System.out.println("Available EVCar parking spots are: " + EVAvailSpots);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot: parkingSpots){
            if(spot.isSpotAvail() && vehicle.getVehicleType().equals(spot.getvehicleType())){
                spot.reserveSpot(vehicle);
                parkingSpots.remove(spot);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot: parkingSpots){
            if(!spot.isSpotAvail() && vehicle.equals(spot.getParkedVehicle())){
                spot.freeSpot();
                parkingSpots.add(spot);
                return true;
            }
        }
        return false;
    }
}
