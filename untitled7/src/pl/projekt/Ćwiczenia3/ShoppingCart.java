package pl.projekt.Ćwiczenia3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private static int COUNTER_ID = 0;
    private int id = COUNTER_ID++;
    private ArrayList<Products> products = new ArrayList<>();
    public double totalPrice(){
        double price= 0;
        for (Products products : this.products) {
            price+= products.getPrice();
        }
        return price;
    }

    public int totalDeliveryTime(){
        int deliveryTime = 0;
        Set<Storage> uniqueStorages = new HashSet<>();

        for (Products products : this.products) {
            if(products.getStorage() != null){
                uniqueStorages.add(products.getStorage());
            }
        }

        for (Storage storage : uniqueStorages) {
            deliveryTime += storage.getDeliveryTime();
        }

        return deliveryTime;
    }

    public void sell(){
        for (Products product : this.products) {
            product.sell();
        }
    }
    public ArrayList<Products> getProducts() {
        return products;
    }
    public int getId() {
        return id;
    }
}

