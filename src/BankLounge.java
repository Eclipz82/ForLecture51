public class BankLounge {
    public static void main(String[] args) {
        BankMain bankVariable = new BankMain();
        bankVariable.checkBalance();
        bankVariable.deposit(10000);
        bankVariable.checkBalance();
        bankVariable.deposit(1000);
        bankVariable.checkBalance();
        bankVariable.withdrawn(700);
        bankVariable.checkBalance();
        bankVariable.withdrawn(500);
        bankVariable.checkBalance();
        bankVariable.withdrawn(501);
        bankVariable.checkBalance();

    }
}
