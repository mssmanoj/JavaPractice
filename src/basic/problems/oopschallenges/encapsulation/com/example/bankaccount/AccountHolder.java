package basic.problems.oopschallenges.encapsulation.com.example.bankaccount;

import java.util.Scanner;

public class AccountHolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter Balance:");
        double balance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(name, balance);
        System.out.println("Bank Account Created...");
        System.out.println(bankAccount.toString());

        System.out.println("Account Balance:");
        System.out.println(bankAccount.getBalance());

        bankAccount.withdrawMoney(500);

        System.out.println("Account Balance:");
        System.out.println(bankAccount.getBalance());

        bankAccount.depositMoney(1500);

        System.out.println("Account Balance:");
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawMoney(10000);

    }
}
