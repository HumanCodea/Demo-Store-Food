package com.hello.DemoStoreFood.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.DemoStoreFood.model.Food;
import com.hello.DemoStoreFood.respositories.FoodRepository;

@Service
public class FoodService {
    
    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }

    public void addFood(Food food){
        foodRepository.save(food);
    }

    public void deleteFood(int id){
        foodRepository.deleteById(id);
    }

    public Food findFoodById(int id){
        return foodRepository.findById(id).get();
    }

    public List<Food> findFoodByName(String nameFood){
        return foodRepository.findFoodByName(nameFood);
    }

}
