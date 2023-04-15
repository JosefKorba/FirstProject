package com.engeto.restaurant;

public class Waiter {

    private int idWaiter;
    private String name;

    public Waiter(int idWaiter, String name) {
        this.idWaiter = idWaiter;
        this.name = name;
    }

    public int getIdWaiter() {
        return idWaiter;
    }

    public void setIdWaiter(int idWaiter) {
        this.idWaiter = idWaiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
