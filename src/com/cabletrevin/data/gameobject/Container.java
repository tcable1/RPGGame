package com.cabletrevin.data.gameobject;

import com.cabletrevin.data.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Container extends GameObject {
    private Inventory containerInventory;
    private boolean locked;
    private int keyID;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Container(String name, String description, boolean pickUp) {
        super(name, description, pickUp);

    }




}