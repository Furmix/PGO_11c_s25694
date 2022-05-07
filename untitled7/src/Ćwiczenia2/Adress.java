package Ćwiczenia2;

public class Adress {

    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Adress(String country, String city, String street, int house, int flat ) {
        this.country= country;
        this.city= city;
        this.street= street;
        this.house= house;
        this.flat= flat;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new RuntimeException("Country must not be empty");
        }
        this.country= country;
    }

    public String getCity() { return city; }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new RuntimeException("City must not be empty");
        }
        this.city= city;
    }

    public String getStreet() { return street; }

    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            throw new RuntimeException("Street must not be empty");
        }
        this.street= street;
    }

    public int getHouse() { return house; }

    public void setHouse(int house) {
        this.house= house;
    }

    public int getFlat() { return flat; }

    public void setFlat(int flat) {
        this.flat= flat;
    }

}