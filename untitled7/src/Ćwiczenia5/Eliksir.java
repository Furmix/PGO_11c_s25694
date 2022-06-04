package Ćwiczenia5;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {

    private String name;
    private boolean isCreated = false;
    private int power ;
    private List<Ingredient> ingredients;
    private Liquid catalyst;


    public Eliksir(String name) {
        this.name = name;
        ingredients = new ArrayList<>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cant be empty or null");
        }
        this.name = name;
    }

    public int getPower() {

        if (isCreated == false) {
            throw new RuntimeException("Eliksir is not created");
        } else {
            return power;
        }
    }


    public void setCatalyst(Liquid catalyst) {
        if (isCreated == false) {
            this.catalyst = catalyst;
        } else {
            throw new RuntimeException("Elisir is already created");
        }
    }

    public void addIngredient(Ingredient ingredient) {
        if (isCreated == true) {
            throw new RuntimeException("You cant do this when eliksir is created");
        } else {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        if (isCreated == true) {
            throw new RuntimeException("You cant do this when eliksir is created");
        } else {
            ingredients.remove(ingredient);
        }
    }

    public void Create() {
        if (isCreated == true) {
            throw new RuntimeException("Elixir is created");
        } else {
            for (int x = 0; x < ingredients.size(); x++ ) {
                power += ingredients.get(x).getReagent();
                System.out.println( power );
                System.out.println( ingredients.get(x).getReagent() );
                System.out.println(catalyst.getReagent() );
            }
            power /= catalyst.getReagent();
            System.out.println( power );

            this.isCreated = true;

        }
    }
}