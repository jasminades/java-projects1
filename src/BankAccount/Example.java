package BankAccount;

public class Example {
    public static void main(String[] args) {
        System.out.println("Welcome! Current state of your bank account: ");
        Account John = new Account("John");
        John.deposit(500.00);


        Account Tom = new Account("Tom");
        Tom.deposit(200.00);

        System.out.println("John transfers to Tom");
        John.transfer(100.00, Tom);

        System.out.println("Tom withdraws ");
        Tom.withdraw(50.0);

        System.out.println("Tom withdraws ");
        Tom.withdraw(600.0);

        System.out.println(Tom.getBalance());
    }

}
