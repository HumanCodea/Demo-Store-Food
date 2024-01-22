package com.hello.DemoStoreFood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.DemoStoreFood.model.MyFood;
import com.hello.DemoStoreFood.respositories.MyFoodRepository;

@Service
public class MyFoodService {

    @Autowired
    private MyFoodRepository myFoodRepository;

    public List<MyFood> getAllMyFood(){
        return myFoodRepository.findAll();
    }

    public void deleteFood(int id){
        myFoodRepository.deleteById(id);
    }

    public void addToMyFood(MyFood food){
        myFoodRepository.save(food);
    }
}
