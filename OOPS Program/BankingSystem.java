import java.util.*;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
            balance =balance+amount;
            System.out.println("Deposited: " + amount);
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; 

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan() {
        return getBalance() >= 5000; 
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; 

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan() {
        return getBalance() >= 10000;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount(101, "Arpit Jain", 70000);
        CurrentAccount ca = new CurrentAccount(102, "Ajay Jain", 150000);
        
        accounts.add(sa);
        accounts.add(ca);

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            }
            System.out.println("--------------------------------");
        }
    }
}
