package RideSharingApp;


public interface FareCalculatorStrategy {
    double calculate(Vehicle vehicle, double distance);
}

class Standard implements FareCalculatorStrategy {

    @Override
    public double calculate(Vehicle vehicle, double distance) {
        return vehicle.getFare();
    }
}

class Luxury implements FareCalculatorStrategy {

    @Override
    public double calculate(Vehicle vehicle, double distance) {
        return vehicle.getFare()*1.5;
    }
}

class Shared implements FareCalculatorStrategy {

    @Override
    public double calculate(Vehicle vehicle, double distance) {
        return vehicle.getFare()*0.5;
    }
}