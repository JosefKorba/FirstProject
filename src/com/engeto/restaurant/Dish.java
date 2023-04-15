package com.engeto.restaurant;

import java.math.BigDecimal;
import java.util.List;

public class Dish {

    private String title;
    private BigDecimal price;
    private int preparationTime;
    private String image;
    private List<String> photos;
    private Category category;

    public Dish(String title, BigDecimal price, int preparationTime, String image, List<String> photos, Category category) {
        this.title = title;
        this.price = price;
        this.preparationTime = preparationTime;
        this.image = image;
        this.photos = photos;
        if (this.photos.isEmpty()) {
            this.photos.add("blank");
        }
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
        if (this.photos.isEmpty()) {
            this.photos.add("blank");
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
