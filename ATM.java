package src.ATM_Interface;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do{
            System.out.println("ATM Machine Interface");
            System.out.println("1. Create an account");
            System.out.println("2. Log in to existing account");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    bank.addAccount(sc);
                    break;
                case 2:
                    Account account = bank.findAccount(sc);
                    if(account != null)
                    {
                        System.out.println("Logged in successfully");
                        showAccountMenu(sc, account);
                    }
                    else
                    {
                        System.out.println("Invalid credentials, please try again.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice != 0);

        sc.close();
    }

    private static void showAccountMenu(Scanner sc, Account account)
    {
        int option;
        do {
            System.out.println();
            System.out.println("Account Menu:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);  // Withdraw amount from account
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);  // Deposit amount into account
                    break;
                case 3:
                    System.out.println("Your balance is: Rs " + account.getBalance());  // Display account balance
                    break;
                case 0:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
}
