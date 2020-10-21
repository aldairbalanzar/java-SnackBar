package snackbarPackage;

public class VendingMachine {
    
    // increment id
    private static int maxId = 0;

    // fields
    private int id;
    private String name;

    // constructor
    public VendingMachine(String name) {
        maxId++;

        id = maxId;
        this.name = name;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
}