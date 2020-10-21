package snackbarPackage;

public class Customer {
    // increment id
    private static int maxId = 0;

    // fields
    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(String name, double cash) {
        maxId++;

        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCash() {
        return cash;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void addCash(double amount) {
        this.cash = this.cash + amount;
    }
    public void spendCash(double amount) {
        this.cash = this.cash - amount;
    }
}
