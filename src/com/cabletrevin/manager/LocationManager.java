package com.cabletrevin.manager;

import com.cabletrevin.data.Location;
import com.cabletrevin.data.gameobject.GameObject;
import com.cabletrevin.manager.GameObjectManager;
public class LocationManager {

    //Creates Locations
    public static Location Meadows = new Location("Meadows", "Seemingly endless fields of wild flowers and lush grass, with wildlife the only concern", false);
    public static Location Pond = new Location("Pond", "As you move northwards, a glistening pond takes form. The inside teems with life of all sizes, and although the pond is stagnant, the creatures within hardly are…", false);
    public static Location MuddyPatch = new Location("Muddy Patch", "You direct yourself westwards, and with each increasing step you take, a sort of weight befalls your legs. You find yourself in a small muddy patch! Frogs and toads alike stare at your frame as you struggle to move…", false);
    public static Location SouthMeadows = new Location("Meadows?", "The thought to move south comes to mind, and with that thought comes action. The meadow continues on forever… Or so it seems.",false);
    public static Location EastMeadows = new Location("Eastern Meadows", "'East is where I want to go' you whisper to no one in particular. Something glints in your eye to the left, but your destination has already been chosen. Grass and wildflowers are all you can see as you venture forth, but as you continue walking your foot hits something… ",
            new GameObject("Jewel", "A sparkling red stone", true), false);


    //Location Getters
    public static Location getMeadows() {
        return Meadows;
    }


    //Sets Location Connections
    public static void setConnections() {
        //Meadows
        Meadows.setnLoc(Pond);
        Meadows.setsLoc(SouthMeadows);
        Meadows.seteLoc(EastMeadows);
        Meadows.setwLoc(MuddyPatch);

        //Pond
        Pond.setnLoc(null);
        Pond.setsLoc(Meadows);
        Pond.seteLoc(null);
        Pond.setwLoc(null);

        //SouthMeadows
        SouthMeadows.setnLoc(Meadows);

        //EastMeadows
        EastMeadows.setwLoc(Meadows);

        //MuddyPatch
        MuddyPatch.seteLoc(Meadows);
    }



}
