package Ćwiczenia5;

public class Main {

    public static void main(String[] args) {

        Ingredient b1 = new Ingredient("vota", 5);
        Liquid b2 = new Liquid("poro", 6, 49);
        Water b3 = new Water("BOLO", 6, 85, true);
        // Water b4 = new Water("paka", 5, 2, false);
        Alkohol b5 = new Alkohol("DARLO", 57, 60, 17);
        //   Ore b6 = new Ore("BOND", 1, 2, true);
        Crystal b7 = new Crystal("boib", 45, 34, 12);
        Plants b8 = new Plants("ROG", 5, 5);
        Flower b9 = new Flower("Rose", 84, 75);
        //   Root b10 = new Root("tORE", 2, 3);



        Water b4 = new Water("paka", 5, 10, false);
        Ore b6 = new Ore("BOND", 28, 12, true);
        Root b10 = new Root("tORE", 5, 8);


        Eliksir e1 = new Eliksir("Torpeda");

        e1.setCatalyst(b4);
        e1.addIngredient(b6);
        e1.addIngredient(b9);
        e1.addIngredient(b10);
        e1.removeIngredient(b9);

        e1.Create();


        System.out.println("Name "+e1.getName());
        System.out.println("Power "+e1.getPower());

    }
}
        /*System.out.println(b3.getName());
        System.out.println(b3.getBaseReagent());
        System.out.println(b3.getDiss());
        System.out.println(b3.getReagent());

        System.out.println(b4.getName());
        System.out.println(b4.getBaseReagent());
        System.out.println(b4.getDiss());
        System.out.println(b4.getReagent());

        System.out.println(b5.getName());
        System.out.println(b5.getBaseReagent());
        System.out.println(b5.getDiss());
        System.out.println(b5.getReagent());

        System.out.println(b6.getName());
        System.out.println(b6.getBaseReagent());
        System.out.println(b6.getPower());
        System.out.println(b6.getReagent());

        System.out.println(b7.getName());
        System.out.println(b7.getReagent());

        System.out.println(b9.getName());
        System.out.println(b9.getReagent());

        System.out.println(b10.getName());
        System.out.println(b10.getReagent());
    */
