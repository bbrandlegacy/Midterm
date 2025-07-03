package Question7.Code;

import java.util.*;

/**
 * 
 */
public class Vehicle {
    private final String id;
    private Owner owner;


    public Vehicle(String id, Owner owner) {
        this.id = id;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}