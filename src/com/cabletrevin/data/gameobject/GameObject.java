package com.cabletrevin.data.gameobject;

public class GameObject {
    private String name;
    private String description;
    private boolean pickUp;

    public GameObject(String name, String description, boolean pickUp) {
        this.name = name;
        this.description = description;
        this.pickUp = pickUp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPickUp() {
        return pickUp;
    }

    public void setPickUp(boolean pickUp) {
        this.pickUp = pickUp;
    }
}
