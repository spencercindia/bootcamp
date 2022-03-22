package com.techelevator.challenge;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
    private BigDecimal overDraftFee = new BigDecimal(10);

    public CheckingAccount(String accountHolder, String accountNum, BigDecimal overDraftFee) {
        super(accountHolder, accountNum);
        this.overDraftFee = overDraftFee;
    }

    public CheckingAccount(String accountHolderName, String accountNumber,
                           BigDecimal balance, BigDecimal overDraftFee) {
        super(accountHolderName, accountNumber, balance);
        this.overDraftFee = overDraftFee;
    }

    @Override
    public BigDecimal withdraw(BigDecimal amountToWithdraw){
        if ((getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(-100)) > 0) && (getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(0)) < 0)){
            return super.withdraw(amountToWithdraw.add(overDraftFee));
        } else if (getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(-99)) < 0){
            return super.getBalance();
        } else {
            return super.withdraw(amountToWithdraw);
        }
    }
}
