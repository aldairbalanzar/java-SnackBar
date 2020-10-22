package snackbarPackage;

public class Main {

    private static void snackBar() {
        Customer jane = new Customer("Jane", 37.75);
        Customer bob = new Customer("Bob", 28.14);
        VendingMachine machine1 = new VendingMachine("machine1");
        Snack soda = new Snack("soda", 21, 5.99, machine1.getId());
        Snack pretzel = new Snack("pretzel", 29, 3.99, machine1.getId());

        System.out.println(jane.getName() + ", cash on hand: " + jane.getCash());
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
        System.out.println(" ");

        System.out.println(jane.getName() + ", cash on hand: " + jane.getCash());
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
        System.out.println(" ");

        System.out.println(bob.getName() + ", cash on hand: " + bob.getCash());
        soda.setQuantity(19);
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
        System.out.println(" ");

        jane.addCash(8.00);
        System.out.println(jane.getName() + " cash on hand " + jane.getCash());
        System.out.println(" ");

        jane.spendCash(1.00);
        System.out.println(jane.getName() + " cash on hand " + jane.getCash());
        System.out.println(" ");

        pretzel.setQuantity(41);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
        System.out.println(" ");

        bob.spendCash(6.00);
        System.out.println(bob.getName() + ", cash on hand: " + bob.getCash());
        pretzel.setQuantity(38);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
        System.out.println(" ");

    }
    
    public static void main(String[] args) {
        snackBar();
    }
}
