package com.hello.DemoStoreFood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hello.DemoStoreFood.model.MyFood;
import com.hello.DemoStoreFood.service.MyFoodService;


@Controller
@RequestMapping(path = "")
public class MyFoodController {

    @Autowired
    private MyFoodService myFoodService;
    
    @GetMapping("/my_foods")
    public ModelAndView getAllMyFood(){
        List<MyFood> list = myFoodService.getAllMyFood();
        return new ModelAndView("myFood", "food", list);
    }

    @RequestMapping("deleteMyList/{id}")
    public String deleteMyFood(@PathVariable("id") int id){
        myFoodService.deleteFood(id);
        return "redirect:/my_foods";
    }

}
