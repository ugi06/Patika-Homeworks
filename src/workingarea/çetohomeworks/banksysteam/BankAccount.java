package workingarea.çetohomeworks.banksysteam;

public abstract class BankAccount {

    private String accountNumber;

    private double balance;

    public void deposito(double amount){

    }

    public void withdraw(double amount){

    }

    public void displayBalance(){

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
