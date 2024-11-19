package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {

    private String accountName;
    private String accountPassword;
    private int age;
    private int accountBalance;

    //ron
    public CasinoAccount(String accountName, String accountPassword) {
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.age = 1;
        this.accountBalance = 1000;

    }

    public String getAccountName() {
        return accountName;
    }

    public int showBalance() {
        return 100;
    }

    public Object getPassword() {
    return null;
    }
}