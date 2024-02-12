package com.cabletrevin;
import com.cabletrevin.data.Player;
import com.cabletrevin.data.gameobject.GameObject;
import com.cabletrevin.data.Location;
import com.cabletrevin.manager.LocationManager;

import java.awt.event.WindowStateListener;
import java.util.Scanner;

import static com.cabletrevin.manager.LocationManager.setConnections;

public class RPGGame {



    public static void InputLoop() {
        boolean victory = false;
        setConnections();
        Scanner scan = new Scanner(System.in);
        Player instancePlayer = new Player("NAME");
        instancePlayer = Player.createPlayer();
        GameObject gameObject = new GameObject("NAME", "DESC", true);

        System.out.println(instancePlayer.getName() + ", you awaken, eyes dry from the hot sun. Your vision is cloudy, but you can make out your surroundings.");
        System.out.println("Please use 'help' for commands");


        while (!victory) {
            System.out.print("> ");
            String UserInput = scan.nextLine();

            //Commands
            switch (UserInput.toLowerCase()) {
                case "quit":
                    System.out.println("Quit? (YES | NO)");
                    System.out.println(">");
                    if (scan.nextLine().equalsIgnoreCase("yes")) {
                        System.out.println("Quitting...");
                        System.exit(0);
                    }
                    else {System.out.println("Action Canceled");
                        break;
                    }
                        break;

                case "n":
                    if (instancePlayer.getCurrentLocation().getnLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().getnLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println("Moved North");
                        System.out.println();
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "s":
                    if (instancePlayer.getCurrentLocation().getsLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().getsLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println("Moved South");
                        System.out.println();
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "e":
                    if (instancePlayer.getCurrentLocation().geteLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().geteLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println("Moved East");
                        System.out.println();
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "w":
                    if (instancePlayer.getCurrentLocation().getwLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().getwLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println("Moved West");
                        System.out.println();
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "b":
                    //Displays all items in inventory
                    //If inventory is empty, then messsage displayed, else iterates through and displays all items
                    if (instancePlayer.getPlayerInventory().getContents().isEmpty())
                        System.out.println("Your inventory is empty...");
                    else {
                        for(int i=0;i<instancePlayer.getPlayerInventory().getContents().size();i++) {
                            System.out.println("[" + i + "]" + " " +instancePlayer.getPlayerInventory().toString());
                        }
                    }
                    break;
                case "i":
                    if (!instancePlayer.getCurrentLocation().getLocationInventory().getContents().isEmpty())
                        System.out.println(instancePlayer.getCurrentLocation().getDescription() + " [Items Available: " + instancePlayer.getCurrentLocation().getLocationInventory().toString() + "]");
                    else System.out.println(instancePlayer.getCurrentLocation().getDescription() + " [Items Available: None]");
                    break;

                case "l":
                    System.out.println(instancePlayer.getCurrentLocation().getName());
                    break;
                case "help":
                    System.out.println("For more information on a specific command, type HELP command-name");
                    System.out.println();
                    System.out.println("""
                            Commands\tDisplays a list of available commands
                            Objective\tDisplay a small description about the objective of the game
                            """);
                    break;
                case "commands":
                    System.out.println("Available commands:\n" +
                            "\n" +
                            "N or North\tMoves the player one location North\n" +
                            "S or South\tMoves the player one location South\n" +
                            "W or West\tMoves the player one location West\n" +
                            "E or East\tMoves the player one location East\n" +
                            "b\t\tDisplays all items in the player’s inventory/bag\n" +
                            "i or inspect\t\tDisplays a description of the location and all the objects it contains\n" +
                            "i or inspect <object name> Given an object name in the current location, display the item’s description\n" +
                            "L\tDisplay the name of the current location\n" +
                            "Get <object name>\tPlaces object in the player’s inventory\n" +
                            "Quit\tExits the game\n");
                    break;
                case "objective":
                    System.out.println("Escape the unknown");
                    break;


                default:
                    //Checks if the user inputed commands not in switch statement
                    if (!UserInput.toLowerCase().startsWith("i ") && !UserInput.toLowerCase().startsWith("get ")) {
                        System.out.println("Command not recognized");
                        System.out.println();
                        System.out.println("You may use the 'help' command for a list of commands");
                    }
                    break;

            }
            //get item command
            if (UserInput.toLowerCase().startsWith("get ")) {
                if (instancePlayer.getCurrentLocation().getLocationInventory().getContents().isEmpty()) {
                    System.out.println("There are no items available");
                }
                else {
                    //trims the get from user input
                    String itemName = UserInput.substring(4).trim();

                    for(int i=0;i<instancePlayer.getCurrentLocation().getLocationInventory().getContents().size();i++) {
                        if (itemName.equalsIgnoreCase(instancePlayer.getCurrentLocation().getLocationInventory().getContents().get(i).getName())) {
                            instancePlayer.getPlayerInventory().addObject(instancePlayer.getCurrentLocation().getLocationInventory().getContents().get(i));
                            instancePlayer.getCurrentLocation().getLocationInventory().getContents().remove(i);
                            System.out.println(instancePlayer.getPlayerInventory().getContents().get(i).getName() + " added to inventory");
                        }
                    }
                }
            }
            //inspect item command
            if (UserInput.toLowerCase().startsWith("i ")) {
                int itemIndex = 0;
                boolean found = false;
                //trims the i from the user input
                String itemName = UserInput.substring(2).trim();


                for (int i = 0; i < instancePlayer.getPlayerInventory().getContents().size(); i++) {
                    if (itemName.equalsIgnoreCase(instancePlayer.getPlayerInventory().getContents().get(i).getName())) {
                        found = true;
                        itemIndex = i;
                        break;
                    }
                }
                if (found) {
                    System.out.println(instancePlayer.getPlayerInventory().getContents().get(itemIndex).getDescription());
                } else System.out.println("The item is not in your inventory or does not exist");
            }
        }

    }



    public static void main(String[] args) {
        InputLoop();
    }
}
