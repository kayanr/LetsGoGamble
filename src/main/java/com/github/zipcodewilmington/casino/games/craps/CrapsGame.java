package com.github.zipcodewilmington.casino.games.craps;

import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.List;

public class CrapsGame {
    private String players;

    public void add(PlayerInterface mockPlayer) {
    }

    public List<PlayerInterface> getPlayers() {
        return players;
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
}
