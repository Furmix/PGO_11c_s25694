package Ćwiczenia7;

import java.util.ArrayList;
import java.util.List;

public class Voldemort extends Character {

    private List<String> horc = new ArrayList<>();

    public Voldemort(Riddle tom) {
        super(tom.getName(), tom.getLocation());
    }

    public void createHorcruxes(int n) {
        int actualSize = horc.size();
        for (int i = 1; i <= n; i++) {
            horc.add("horcrux " + (i + actualSize));
        }
    }

    public void printHorcruxes() {
        System.out.println("Created horcruxes:");
        for (int i = 1; i <= horc.size(); i++) {
            System.out.println("horcrux " + i);
        }
    }
}
