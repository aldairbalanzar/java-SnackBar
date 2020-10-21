package snackbarPackage;

public class Main {

    private static void snackBar() {
        Customer customer1 = new Customer("Aldair", 10.99);
        System.out.println(customer1.getName());
    }
    
    public static void main(String[] args) {
        snackBar();
    }
}
