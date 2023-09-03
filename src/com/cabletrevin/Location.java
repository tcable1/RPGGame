package com.cabletrevin;

import java.util.LinkedList;

public class Location {
    private String name;
    private String description;
    private Location[] connections;
    private LinkedList<GameObject> gameObjects;

    public Location(String locationName, String description) {
        this.name = locationName;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setConnections(Location[] connections) {
        this.connections = connections;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Location[] getConnections() {
        return connections;
    }
}
