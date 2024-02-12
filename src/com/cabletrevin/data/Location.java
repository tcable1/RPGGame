package com.cabletrevin.data;

import com.cabletrevin.data.gameobject.GameObject;

import java.util.LinkedList;

public class Location {
    private String name;
    private String description;
    private Inventory locationInventory;
    private Location nLoc;
    private Location sLoc;
    private Location eLoc;
    private Location wLoc;
    private boolean hasPlayer;
    private Player currentPlayer = null;
    private boolean hasObjects;

    //Location constructor with new inventory
    public Location(String locationName, String description, boolean hasObjects) {
        this.name = locationName;
        this.description = description;
        this.locationInventory = new Inventory(false);
        this.hasObjects = false;
    }

    public Inventory getLocationInventory() {
        return locationInventory;
    }

    public Location(String locationName, String description, GameObject gameObject, boolean hasObjects) {
        this.name = locationName;
        this.description = description;
        this.locationInventory = new Inventory(false);
        this.locationInventory.addObject(gameObject);
        this.hasObjects = true;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addObject(GameObject gameObject) {
        locationInventory.addObject(gameObject);
    }

    public void removeObject(GameObject gameObject) {
        locationInventory.removeObject(gameObject);
    }


    //Many getters & setters
    public void addPlayer(Player player) {
        currentPlayer = player;
    }
    public void removePlayer(Player player) {
        currentPlayer = null;  //null if player is not present
    }

    public Location getnLoc() {
        if (nLoc != null)
        return nLoc;
        else return null;
    }

    public void setnLoc(Location nLoc) {
        this.nLoc = nLoc;
    }

    public Location getsLoc() {
        if (sLoc != null)
            return sLoc;
        else return null;
    }

    public void setsLoc(Location sLoc) {
        this.sLoc = sLoc;
    }

    public Location geteLoc() {
        if (eLoc != null)
            return eLoc;
        else return null;
    }

    public void seteLoc(Location eLoc) {
        this.eLoc = eLoc;
    }

    public Location getwLoc() {
        if (wLoc != null)
            return wLoc;
        else return null;
    }

    public void setwLoc(Location wLoc) {
        this.wLoc = wLoc;
    }

    public boolean isHasPlayer() {
        return hasPlayer;
    }

    public void setHasPlayer(boolean hasPlayer) {
        this.hasPlayer = hasPlayer;
    }
}
