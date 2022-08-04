public class BankAccountTest {
    public static void main(String[] args) {

        //            Declare    ||    Instantiate     ||   Initialize default
        BankAccount bankAccount = new BankAccount(15000.85, 9795.45);

        System.out.println(bankAccount.getCheckings());

        bankAccount.depositChecking(3000);

        System.out.println(bankAccount.getCheckings());

    }
}