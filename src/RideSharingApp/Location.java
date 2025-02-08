package RideSharingApp;

import static java.lang.Math.*;

public class Location {
    public double x;
    public double y;

    public Location(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double calculateDistance(Location location){
        double x = pow((location.getX()-this.getX()), 2);
        double y = pow((location.getY()-this.getY()), 2);

        return sqrt(x+y);
    }
}
