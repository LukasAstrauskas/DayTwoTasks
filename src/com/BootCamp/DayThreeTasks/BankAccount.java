package com.BootCamp.DayThreeTasks;

import java.math.BigDecimal;

public class BankAccount {

    private BigDecimal balance;
    private final BigDecimal maxAmount = new BigDecimal(5000);

    public BankAccount() {
    }

    public BankAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String deposit(BigDecimal amount) {
        BigDecimal bD = new BigDecimal(0);
        if (amount.compareTo(bD) < 0) {
            return "Should be positive value.";
        } else if (amount.compareTo(maxAmount) > 0) {
            return "Transaction cancelled. Max deposit: " + maxAmount + ". Your deposit: " + amount;
        } else {
            this.balance = balance.add(amount);
            return "Deposit made.";
        }
    }

    public String withdraw(BigDecimal amount) {
        BigDecimal bD = new BigDecimal(0);
        if (amount.compareTo(balance) < 0) {
            return "There is not enough funds.";
        }
        if (amount.compareTo(bD) < 0) {
            this.balance = balance.subtract(amount);
            return "Withdraw complete";
        }
        return "Amount should be positive";
    }

    public void printBalance() {
        System.out.println("Ballance: " + balance);
    }

    public String transfer( BankAccount account, BigDecimal amount) {
        if (amount.compareTo(balance) > 0) {
            return "Transfer cancelled. You are trying to transfer " +
                    amount + " units, but only " + balance + " are available.";
        } else {
            account.deposit(amount);
            withdraw(amount);
            return "Transfer cancelled. You are trying to transfer 30 units, but only 25 are available.";
        }
    }

    public void transferALLBalance(BankAccount account) {
        account.deposit(balance);
        withdraw(balance);
    }

}
