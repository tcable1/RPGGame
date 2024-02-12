package com.cabletrevin.data.gameobject;

public class Key extends GameObject {
    private Container containerUnlocks;


    public Container getContainerUnlocks() {
        return containerUnlocks;
    }

    public void setContainerUnlocks(Container containerUnlocks) {
        this.containerUnlocks = containerUnlocks;
    }

    public Key(String name, String description, boolean pickUp) {
        super(name, description, pickUp);
    }
}
