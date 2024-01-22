package com.hello.DemoStoreFood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.DemoStoreFood.model.Food;
import com.hello.DemoStoreFood.model.MyFood;
import com.hello.DemoStoreFood.service.FoodService;
import com.hello.DemoStoreFood.service.MyFoodService;


@Controller
@RequestMapping(path = "")
public class FoodController {
    
    @Autowired
    private FoodService foodService;

    @Autowired
    private MyFoodService myFoodService;

    @GetMapping("/home")
    public String HomePage(){
        return "home";
    }

    @GetMapping("/available_foods")
    public String availableFoods(Model model, @Param("nameFood") String nameFood){
        List<Food> list = foodService.getAllFood();
        if (nameFood != null) {
            list = foodService.findFoodByName(nameFood);
            model.addAttribute("nameFood", nameFood);
        }
        model.addAttribute("food", list);
        return "availableFood";
    }

    @PostMapping("/save")
    public String saveFood(@ModelAttribute Food food){
        foodService.addFood(food);
        return "redirect:/available_foods";
    }

    @GetMapping("/food_register")
    public String addNewFood(){
        return "foodRegister";
    }

    @RequestMapping("/deleteList/{id}")
    public String deleteFood(@PathVariable("id") int id){
        foodService.deleteFood(id);
        return "redirect:/available_foods";
    }

    @RequestMapping("/editList/{id}")
    public String editFood(@PathVariable("id") int id,Model model){
       Food newFood = foodService.findFoodById(id);
       model.addAttribute("food", newFood);
        return "editFood";
    }

    @RequestMapping("/mylist/{id}")
    public String addToMyFood(@PathVariable("id") int id){
        Food newFood = foodService.findFoodById(id);
        MyFood myFood = new MyFood(newFood.getId(), newFood.getNameFood(), newFood.getManufacturer(), newFood.getCategory(), newFood.getQuantity(), newFood.getYears(), newFood.getPrices());
        myFoodService.addToMyFood(myFood);
        return "redirect:/my_foods";
    }


}
