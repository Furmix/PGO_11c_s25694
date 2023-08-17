package pl.projekt.Ćwiczenia3;

import java.util.ArrayList;

public class Storage {

    private int deliveryTime;
    private ArrayList<Products> products = new ArrayList<>();

    public Storage(int deliveryTime) {
        this.setDeliveryTime(deliveryTime);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if(deliveryTime < 0){
            throw new RuntimeException("Time cant be below 0");
        }
        this.deliveryTime = deliveryTime;
    }
}
