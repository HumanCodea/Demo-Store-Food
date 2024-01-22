package com.hello.DemoStoreFood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MyFood")
public class MyFood {

    @Id
    private int Id;
    @Column(name = "name_food")
    private String nameFood;
    private String Manufacturer;
    private String Category;
    private String Quantity;
    private String Years;
    private String Prices;

    public MyFood(){}

    public MyFood(int id, String nameFood, String manufacturer, String category, String quantity, String years,
            String prices) {
        Id = id;
        this.nameFood = nameFood;
        Manufacturer = manufacturer;
        Category = category;
        Quantity = quantity;
        Years = years;
        Prices = prices;
    }

}
