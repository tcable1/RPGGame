package com.cabletrevin.data;

import com.cabletrevin.data.gameobject.GameObject;
import com.cabletrevin.manager.LocationManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private Location currentLocation = null;
    private Inventory playerInventory;

    //Player Constructor with all custom parameters
    public Player(String name, Location currentLocation, Inventory playerInventory){
        this.name = name;
        this.currentLocation = currentLocation;
        this.playerInventory = playerInventory;
    }
    //Player Constructor with default loc. and inv.
    public Player(String name){
        this.name = name;
        this.currentLocation = LocationManager.getMeadows();
        this.playerInventory = new Inventory(false);
    }

    //Will create a player with default Inv and Loc/ with set name
    public static Player createPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter player name: ");
        String name = scan.nextLine();
        System.out.println("Player " + name + " created");
        return new Player(name);
    }


    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;

    }

    public String getName() {
        return name;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(Inventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    //Add and Remove gameObjects from inv.









}
