package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();
    private boolean isVip = false;
    private int balance;

    public BankCustomer() {
    }

    public boolean isVip(){

        for (Accountable account : accounts) {
            balance += account.getBalance();
        }
        if (balance >= 25000){
            isVip = true;
            return isVip;
        }
        return isVip;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public Accountable[] getAccounts(){
        return accounts.toArray(new Accountable[accounts.size()]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}