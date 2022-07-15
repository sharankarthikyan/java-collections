/*
* The class objects should the same from the initialization in constructor and remains the same at the end of the program.
* We are returning a copy of each attributes in all the getter methods, hence it will not change the real one.
* https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
*/

import java.util.HashMap;
import java.util.Map;

public class Location {
    // Attributes of Location
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    // Initialization
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null) {
            this.exits = new HashMap<>(exits); // we are creating a new object to make exits immutable.
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

    // Getters
    public int getLocationID() {
        return locationID; // This won't return a value by reference, hence we don't need to create a new instance for this object.
    }

    public String getDescription() {
        return description; // This won't return a value by reference, hence we don't need to create a new instance for this object.
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits); // we are creating a new object to make exits immutable.
    }

    // Behaviours of Location
//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }
}
