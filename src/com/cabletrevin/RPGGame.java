package com.cabletrevin;

import java.util.Scanner;

public class RPGGame {
    public static void InputLoop() {
        boolean victory = false;
        Scanner scan = new Scanner(System.in);



        while (!victory) {
            System.out.println(">");
            String UserInput = scan.nextLine();

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
                    break;
                case "s":
                    break;
                case "e":
                    break;
                case "w":
                    break;
                case "b":
                    break;
                case "i":
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
