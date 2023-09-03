package com.cabletrevin;

import java.util.List;

public class Player {
    private String name;
    private Location currentLocation;
    private List<GameObject> inventory;

    public Player(String name, Location currentLocation, List<GameObject> inventory){
        this.name = name;
        this.currentLocation = currentLocation;
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setInventory(List<GameObject> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public List<GameObject> getInventory() {
        return inventory;
    }
}
