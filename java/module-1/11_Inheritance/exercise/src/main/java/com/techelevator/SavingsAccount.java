package com.techelevator;

public class SavingsAccount extends BankAccount {

    private int serviceCharge = 2;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithDraw){
        if (getBalance() - amountToWithDraw < 150
                && getBalance() - (amountToWithDraw + serviceCharge) >= 0){
            return super.withdraw(amountToWithDraw+serviceCharge);
        } else if (getBalance() - (amountToWithDraw + serviceCharge) < 0){
            return getBalance();
        } else {
            return super.withdraw(amountToWithDraw);
        }
    }
}
