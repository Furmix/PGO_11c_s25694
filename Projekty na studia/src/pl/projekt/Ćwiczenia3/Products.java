package pl.projekt.Ćwiczenia3;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private static final List<Products> ALL = new ArrayList<>();

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;

    public Products(String name, ProductType productType, double price, int quantity) {
        this.setName(name);
        this.setProductType(productType);
        this.setPrice(price);
        this.setQuantity(quantity);
        ALL.add(this);
    }

    public Products(String name, ProductType productType, double price, int quantity, Storage storage) {
        this.setName(name);
        this.setProductType(productType);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setStorage(storage);
        ALL.add(this);
    }

    public boolean isAvailable(){
        return this.quantity > 0;
    }

    public void sell(){
        if(this.isAvailable()){
            this.quantity--;
        } else {
            throw new RuntimeException("Dont have this product");
        }
    }

    public void increaseQuantity(int counter){
        if(counter <= 0){
            throw new RuntimeException("Wrong number");
        }
        this.quantity += counter;
    }
    public Storage getStorage() {
        return storage;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()){
            throw new RuntimeException("Name cant be empty");
        }
        this.name = name;
    }

    public void setProductType(ProductType productType) {
        if(productType == null){
            throw new RuntimeException("Product typ ecant be empty");
        }
        this.productType = productType;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new RuntimeException("More than 0");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            throw new RuntimeException("More than 0");
        }
        this.quantity = quantity;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public static void showAllProducts(){
        for (Products product : ALL) {
            System.out.println(product.getName() + "  price: " + product.getPrice() + "\n" + "quantity: " + product.getQuantity());
        }
        System.out.println();
    }

}