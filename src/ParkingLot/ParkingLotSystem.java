package ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class ParkingLotSystem {
    private static ParkingLotSystem instance;
    private List<ParkingLevel> levels;

    private ParkingLotSystem(){
        levels = new ArrayList<>();
    }

    public static ParkingLotSystem getInstance(){
        if(instance == null){
            instance = new ParkingLotSystem();
        }
        return instance;
    }

    public void addLevel(ParkingLevel level){
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingLevel level: levels){
            if(level.parkVehicle(vehicle)){
                System.out.println("Successfully parked vehicle: "+ vehicle.getNumplate() + " on level: "+ level.getLevelID());
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingLevel level: levels){
            if(level.unparkVehicle(vehicle)){
                System.out.println("Successfully unparked vehicle: "+ vehicle.getNumplate() + " on level: "+ level.getLevelID());
                return true;
            }
        }
        return false;
    }

    public void displayStats(){
        for(ParkingLevel level: levels){
            level.displayLevelStats();
        }
    }
}
