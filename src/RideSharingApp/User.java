package RideSharingApp;

public abstract class User {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    protected Location location;

    public User(String name, Location location){
        this.name = name;
        this.location = location;
    }

    public abstract void notify(String msg);

}
