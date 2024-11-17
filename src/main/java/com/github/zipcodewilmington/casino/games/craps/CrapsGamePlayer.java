package com.github.zipcodewilmington.casino.games.craps;

public class CrapsGamePlayer {
    public CrapsGamePlayer(Object o) {
        CrapsGame player;

    }
    private String accountName;
    private int accountBalance;
    public CrapsGamePlayer() {
        this(" ", 0);
    }
    public CrapsGamePlayer(String accountName,  int accountBalance) {
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
