package com.hello.DemoStoreFood.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.hello.DemoStoreFood.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{

    @Query("Select c From Food c Where c.nameFood like %?1%")
    public List<Food> findFoodByName(String nameFood);

}
