package ParkingLot;

public class Main {
    public static void main(String[] args) {
        // create vehicles
        Vehicle car1 = new Car("'AA");
        Vehicle car2 = new Car("'GA");
        Vehicle bike = new Bike("'GR");

        // create parking spots for each level
        ParkingLevel level1 = new ParkingLevel(1);
        for(int i = 0; i<10;i++){
            level1.addParkingSpot(new CarParkingSpot(i*10));
        }
        for(int i = 0; i<5;i++){
            level1.addParkingSpot(new BikeParkingSpot(i*15));
        }
        for(int i = 0; i<3;i++){
            level1.addParkingSpot(new EVParkingSpot(i*12));
        }

        ParkingLevel level2 = new ParkingLevel(2);
        for(int i = 0; i<12;i++){
            level2.addParkingSpot(new CarParkingSpot(i*10));
        }
        for(int i = 0; i<5;i++){
            level2.addParkingSpot(new BikeParkingSpot(i*15));
        }
        for(int i = 0; i<9;i++){
            level2.addParkingSpot(new EVParkingSpot(i*12));
        }

        // create parking system
        ParkingLotSystem parkingLotSystem = ParkingLotSystem.getInstance();

        parkingLotSystem.addLevel(level1);
        parkingLotSystem.addLevel(level2);


        //display
        parkingLotSystem.displayStats();

        // park a vehicle
        parkingLotSystem.parkVehicle(car1);
        parkingLotSystem.parkVehicle(bike);

        parkingLotSystem.displayStats();
    }
}
