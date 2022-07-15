import java.util.HashMap;
import java.util.Map;

public class Location {
    // Attributes of Location
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    // Initialization
    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    // Getters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    // Behaviours of Location
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
