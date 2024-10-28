package src.ATM_Interface;

public class Account {
    private String name;
    private int pin;
    private double balance;

    // Constructor
    public Account(String name, int pin, double balance)
    {
        this.name    = name;
        this.pin     = pin;
        this.balance = balance;
    }

    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Transaction successful! Amount withdrawn = Rs " + amount);
        }
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Transaction successful! Amount deposited = Rs " + amount);
    }

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    public int getPin()
    {
        return pin;
    }
}

