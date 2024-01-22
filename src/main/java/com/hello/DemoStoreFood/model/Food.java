package com.hello.DemoStoreFood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "name_food")
    private String nameFood;
    private String Manufacturer;
    private String Category;
    private String Quantity;
    private String Years;
    private String Prices;

    public Food(){

    }

    public Food(String nameFood, String manufacturer, String category, String quantity, String years, String prices) {
        this.nameFood = nameFood;
        Manufacturer = manufacturer;
        Category = category;
        Quantity = quantity;
        Years = years;
        Prices = prices;
    }

}
