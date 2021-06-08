package models;

import interfaces.CanMakePayment;
import models.Parent;

import java.util.Date;
import java.util.List;

public class User extends Parent implements CanMakePayment {

    private String username;
    private String password;
    private String role;
    private List<Currency> currency;
    private final Date creationDate = new Date();

    public User() {
        super("Empty user");
        System.out.println("New user created!");
    }

    public User(String username,
                String password,
                String role) {
        super(username);
        this.username = username;
        this.password = password;
        this.role = role;

        System.out.println("New user created: " + username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<Currency> getCurrency() {
        return currency;
    }

    public User setCurrency(List<Currency> currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public void makeTransaction(Currency currency, int amount) {
        System.out.printf("Current user: %s", this.username);
        this.currency.stream()
                .filter(currency1 -> currency1.getName().equals(currency.getName()))
                .forEach(currency1 -> {
                    System.out.printf("Transaction completed. %s %s%n", currency.getName(), amount);
                });


    }

    @Override
    public void showCurrency() {
        System.out.println("Current currency:");
        this.currency.forEach(currency1 -> System.out.println(currency1.getName()));
    }
}
