package com.cabletrevin.data.gameobject;

import java.util.ArrayList;
import java.util.List;

public class Container extends GameObject {
    private List<GameObject> containerInventory;
    private boolean locked;
    private GameObject key;

    public GameObject getKey() {
        return key;
    }

    public void setKey(GameObject key) {
        this.key = key;
    }

    public void setContainerInventory(List<GameObject> containerInventory) {
        this.containerInventory = containerInventory;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Container(String name, String description, boolean pickUp) {
        super(name, description, pickUp);
        containerInventory = new ArrayList<>();
    }

    public List<GameObject> getContainerInventory() {
        return containerInventory;
    }

    public void addGameObject(GameObject gameObject) {
        containerInventory.add(gameObject);
    }
    public void removeGameObject(GameObject gameObject) {
        containerInventory.remove(gameObject);
    }
}