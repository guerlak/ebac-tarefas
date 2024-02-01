package model;

public class Customer {

    private String name;
    private String gender;
    
    public Customer(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getMale() {
        return gender;
    }
}
