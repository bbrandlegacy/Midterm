package Question7.Code;

import java.util.*;


public class Owner {
    private String name;
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public void addVehicle(String Vin) {
        Vehicle vehicle = new Vehicle(Vin, this);
        vehicles.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public String listOfVehicles() {
        return vehicles.toString();
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles.toString() +
                '}';
    }
}