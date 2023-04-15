package com.engeto.restaurant;

import java.time.LocalDateTime;

public class Order {

    private Table table;
    private Waiter waiter;
    private Dish dish;
    private LocalDateTime orderedTime;
    private LocalDateTime fulfilmentTime;

    public Order(Table table, Waiter waiter, Dish dish, LocalDateTime orderedTime, LocalDateTime fulfilmentTime) {
        this.table = table;
        this.waiter = waiter;
        this.dish = dish;
        this.orderedTime = orderedTime;
        this.fulfilmentTime = fulfilmentTime;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public LocalDateTime getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(LocalDateTime orderedTime) {
        this.orderedTime = orderedTime;
    }

    public LocalDateTime getFulfilmentTime() {
        return fulfilmentTime;
    }

    public void setFulfilmentTime(LocalDateTime fulfilmentTime) {
        this.fulfilmentTime = fulfilmentTime;
    }
}
