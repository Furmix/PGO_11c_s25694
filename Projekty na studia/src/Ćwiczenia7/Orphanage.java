package Ćwiczenia7;

import java.util.ArrayList;
import java.util.List;

public class Orphanage {
    private String name;
    private Location location;
    private List<Child> childs = new ArrayList<>();

    public Orphanage(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    public void addChild(Child child){
        childs.add(child);

    }


    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
