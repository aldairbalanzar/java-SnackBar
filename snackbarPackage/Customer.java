package snackbarPackage;

public class Customer {
    // increment id
    private static int maxId = 0;

    // fields
    private int id;
    private String name;
    private float cash;

    // constructor
    public Customer(String name, float cash) {
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
    public float getCash() {
        return cash;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void addCash(float amount) {
        this.cash = this.cash + amount;
    }
    public void spendCash(float amount) {
        this.cash = this.cash - amount;
    }
}
