package src.ATM_Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank()
    {
        accounts = new ArrayList<>();
    }

    public void addAccount(Scanner sc) {
        System.out.print("Enter Account Holder's Name: ");
        String name = sc.next();
        System.out.println();

        System.out.print("Enter 4-digit security PIN: ");
        int pin = sc.nextInt();
        System.out.println();

        System.out.print("Enter Initial Deposit Amount: ");
        double balance = sc.nextDouble();
        System.out.println();

        Account account = new Account(name, pin, balance);
        accounts.add(account);

        System.out.println("Account created successfully");
    }

    public Account findAccount(Scanner sc)
    {
        System.out.print("Enter your Name: ");
        String name = sc.next();
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        for(Account account: accounts)
        {
            if(account.getName().equals(name) && account.getPin() == pin)
            {
                return account;
            }
        }
        return null;
    }
}
