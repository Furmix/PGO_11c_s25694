package Ćwiczenia7;

import java.util.ArrayList;
import java.util.List;

public class Character {
    protected  Location location;
    protected String name;
    private int health = 100;
    private static List<Character> chara = new ArrayList<>();
    private static ArrayList<Character> target = new ArrayList<>();

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
        chara.add(this);
        this.health=health;
    }



    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }


    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }

    public void introduce() {
        System.out.println("Hello, I am " + getName());
    }

    public void doSth(String activity) {
        System.out.println("I am " + name + ", I am " + activity);
    }

    public static void doSth(String activity, Character... characters) {
        for (Character character : characters) {
            character.doSth(activity);
        }



    }
    public void target (Character character){
        target.add(character);
    }



    public static void status(){
        System.out.println("====Status====");
        for(Character character : chara)
            System.out.println(character.getName() + " : " + character.getHealth());
        System.out.println("==============");
    }



    public void say(String text, Character character) {
        System.out.println(this.name + " to " + character.getName());
        System.out.println("    " + text);
    }

    public static void MoveAllTo(Location newLocation, Character... characters) {
        for (Character character : characters) {
            character.MoveAllTo(newLocation);
        }
    }
    public void moveTo(Orphanage orphanage){
        this.location = orphanage.getLocation();
    }

}
