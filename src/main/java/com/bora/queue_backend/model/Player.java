package com.bora.queue_backend.model;

import java.util.UUID;

public class Player {
    private UUID uuid;
    private int balance;
    private int level;
    private String username;

    public Player(UUID uuid, int balance, int level, String username){
        this.uuid = uuid;
        this.balance = balance;
        this.level = level;
        this.username = username;
    }

    //getters//
    public int getBalance(){
        return balance;
    }
    public UUID getUUID(){
        return uuid;
    }
    public int getLevel(){
        return level;
    }
    public String getUsername(){
        return username;
    }

    //setters//
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void addBalance(int amountToAdd){
        this.balance += amountToAdd;
    }
    public void setUsername(String username){
        this.username = username;
    }
}
