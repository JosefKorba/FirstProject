package com.engeto.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Dish> menuList = new ArrayList<>();

    public Menu(List<Dish> dishes) {
        this.menuList = dishes;
    }

    public void addDish(Dish dish) {
        this.menuList.add(dish);
    }

    public void removeDish(Dish dish) {
        this.menuList.remove(dish);
    }

    public void clear() {
        this.menuList.clear();
    }
}
