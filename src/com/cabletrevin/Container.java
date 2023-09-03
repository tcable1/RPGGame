package com.cabletrevin;

import java.util.ArrayList;
import java.util.List;

public class Container extends GameObject{
    private List<GameObject> containerInventory;

    public Container(String name, String description, boolean pickUp) {
        super(name, description, pickUp);
        containerInventory = new ArrayList<>();
    }
}