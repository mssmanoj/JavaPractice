package basic.problems.oopschallenges.encapsulation.com.example.bankaccount;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber = 0;
    private double accountBalance;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }

    BankAccount(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber++;
        this.accountBalance = accountBalance;
    }

    protected double getBalance() {
        return accountBalance;
    }

    public void depositMoney(double cash) {
        System.out.println(cash + " Deposited!!!");
        accountBalance += cash;
    }

    public void withdrawMoney(double cash) {
        if (cash<=accountBalance){
            System.out.println(cash + " Withdrawn!!!");
            accountBalance -= cash;
        }
        System.out.println("Insufficient Account Balance!!");
    }
}
