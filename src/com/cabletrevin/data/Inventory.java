package com.cabletrevin.data;

import com.cabletrevin.data.gameobject.GameObject;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<GameObject> contents;
    private boolean locked;


    //Inventory constructor with default contents
    public Inventory(boolean locked) {
        this.contents = new ArrayList<GameObject>();
        this.locked = locked;
    }

    //Inventory constructor with custom contents
    public Inventory(ArrayList<GameObject> contents, boolean locked) {
        this.contents = contents;
        this.locked = locked;
    }

    public void addObject(GameObject gameObject) {
        this.contents.add(gameObject);
    }

    public void removeObject(GameObject gameObject) {
        this.contents.remove(gameObject);
    }



    @Override
    public String toString() {
        for(int i=0;i<contents.size();i++) {
            return contents.get(i).getName();
        }
        return "";
    }


    //Getters + Setters
    public ArrayList<GameObject> getContents() {
        return contents;
    }

    public void setContents(ArrayList<GameObject> contents) {
        this.contents = contents;


    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
