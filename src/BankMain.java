public class BankMain {

    private int bankBalance = 0;

    public void deposit(int amount) {
        if (amount >= 10000) {
            System.out.println("Need to register sum in VID");
        } else {
            bankBalance = bankBalance + amount;
            System.out.println("You have deposite " + amount + " euro");
        }
    }

    public void withdrawn(int amount) {
        if (amount >= 700) {
            System.out.println("Daily limit exceeded");
        } else {
            if (bankBalance - amount < 0) {
                System.out.println("You don't have enough money");
            } else {
                bankBalance = bankBalance - amount;
                System.out.println("You have " + amount + " euro on your bank account");
            }
        }
    }

            public void checkBalance() {
                System.out.println("You have " + bankBalance + " euro on your bank account");

            }
        }

