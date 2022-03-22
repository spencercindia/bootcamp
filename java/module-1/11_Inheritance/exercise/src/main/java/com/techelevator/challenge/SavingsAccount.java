package com.techelevator.challenge;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

    private BigDecimal serviceCharge = new BigDecimal(2);

    public SavingsAccount(String accountHolder, String accountNum) {
        super(accountHolder, accountNum);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public BigDecimal withdraw(BigDecimal amountToWithDraw){
        if (getBalance().subtract(amountToWithDraw).compareTo(new BigDecimal(150)) < 0
                && getBalance().subtract(amountToWithDraw.add(serviceCharge)).compareTo(new BigDecimal(0)) > -1){
            return super.withdraw(amountToWithDraw.add(serviceCharge));
        } else if (getBalance().subtract(amountToWithDraw.add(serviceCharge)).compareTo(new BigDecimal(0)) < 0){
            return getBalance();
        } else {
            return super.withdraw(amountToWithDraw);
        }
    }
}

