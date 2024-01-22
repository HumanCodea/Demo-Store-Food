package com.hello.DemoStoreFood.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.DemoStoreFood.model.MyFood;

@Repository
public interface MyFoodRepository extends JpaRepository<MyFood, Integer>{
    
}
