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

        System.out.println(instancePlayer.getName() + ", you awaken, eyes dry from the hot sun. Your vision is cloudy, but you can make out your surroundings. " + instancePlayer.getCurrentLocation().getDescription());






        System.out.println("Please use 'help'");
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
                        System.out.println(instancePlayer.getCurrentLocation().getName());
                        System.out.println();
                        System.out.println(instancePlayer.getCurrentLocation().getDescription());
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "s":
                    if (instancePlayer.getCurrentLocation().getsLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().getsLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println(instancePlayer.getCurrentLocation().getName());
                        System.out.println();
                        System.out.println(instancePlayer.getCurrentLocation().getDescription());
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "e":
                    if (instancePlayer.getCurrentLocation().geteLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().geteLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println(instancePlayer.getCurrentLocation().getName());
                        System.out.println();
                        System.out.println(instancePlayer.getCurrentLocation().getDescription());
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "w":
                    if (instancePlayer.getCurrentLocation().getwLoc() != null) {
                        instancePlayer.getCurrentLocation().setHasPlayer(false);
                        instancePlayer.setCurrentLocation(instancePlayer.getCurrentLocation().getwLoc());
                        instancePlayer.getCurrentLocation().setHasPlayer(true);
                        System.out.println(instancePlayer.getCurrentLocation().getName());
                        System.out.println();
                        System.out.println(instancePlayer.getCurrentLocation().getDescription());
                        break;
                    }
                    else System.out.println("You cannot go this way...");
                    break;
                case "b":

                    break;
                case "i":
                    System.out.println(instancePlayer.getCurrentLocation().getDescription() + " Items Available: " + instancePlayer.getCurrentLocation().getLocationInventory().toString());
                    break;
                case "l":
                    break;
                case "get":
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
                    break;


                default:
                    System.out.println("Command not recognized");
                    System.out.println();
                    System.out.println("You may use the 'help' command for a list of commands");
                    break;

            }
        }

    }



    public static void main(String[] args) {
        InputLoop();
    }
}
