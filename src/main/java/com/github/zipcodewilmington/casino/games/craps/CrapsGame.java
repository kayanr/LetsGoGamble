package com.github.zipcodewilmington.casino.games.craps;

import com.github.zipcodewilmington.casino.PlayerInterface;

public class CrapsGame {
    private String players;

    public void add(PlayerInterface mockPlayer) {
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public boolean isGameOver() {
        return false;
    }

    public int getRandom() {
        return 0;
    }

    public int getBet() {
        return 0;
    }

    public boolean isWin() {
        return false;
    }

    public void setPoint(int expectedPoint) {

    }

    public int rollDice() {
        return 0;
    }

    public void Roll(Object o, int winRoll) {

    }





    public boolean checkWin() {
        return isWin();
    }

    public boolean canAfford() {
        return false;
    }

    public void setBet(int i) {
    }

    public void setBalance(int i) {
    }

    public void playTurn() {
    }
}
