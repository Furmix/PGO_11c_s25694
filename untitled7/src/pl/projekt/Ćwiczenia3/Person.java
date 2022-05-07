package pl.projekt.Ćwiczenia3;

import java.util.ArrayList;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentCart;
    private ArrayList<ShoppingCart> historyCarts = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.setName(name);
        this.setSurname(surname);
        this.setMoneyInCash(moneyInCash);
        this.setMoneyOnCard(moneyOnCard);
    }

    public void setName(String name){
        if (name == null) {
            throw new RuntimeException("Name cant be empty");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        if(surname == null) {
            throw new RuntimeException("Surname cant be empty");
        }
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }
    public void setMoneyInCash(double moneyInCash){
        if(moneyInCash < 0){
            throw new RuntimeException("Need more money in cash");
        }
        this.moneyInCash = moneyInCash;
    }
    public double getMoneyInCash(){
        return moneyInCash;
    }
    public void setMoneyOnCard(double moneyOnCard){
        if(moneyOnCard < 0){
            throw new RuntimeException("Need more money on caerd");
        }
        this.moneyOnCard = moneyOnCard;
    }
    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void makeOrder(){
        this.currentCart = new ShoppingCart();
    }


}

