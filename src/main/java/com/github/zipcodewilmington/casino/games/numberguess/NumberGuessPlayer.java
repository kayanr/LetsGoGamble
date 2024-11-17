package com.github.zipcodewilmington.casino.games.numberguess;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer {
    private String accountName;

    private int accountBalance;


    public NumberGuessPlayer() {
        this(" ", 0);

    }

    public NumberGuessPlayer(String accountName,  int accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;

    }



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}