package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
    private int overdraftFee = 10;

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        if (getBalance() - amountToWithdraw > -100 && getBalance() - amountToWithdraw < 0){
            return super.withdraw(amountToWithdraw+overdraftFee);
        } else if (getBalance() - amountToWithdraw <= -100){
            return super.getBalance();
        } else {
            return super.withdraw(amountToWithdraw);
        }
    }
}
