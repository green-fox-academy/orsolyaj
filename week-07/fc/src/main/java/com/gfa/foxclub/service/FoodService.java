package com.gfa.foxclub.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Qualifier("food")
public class FoodService {
  private List<String> foodList;
  private List<String> drinkList;

  public FoodService() {
    foodList = Arrays.asList("pasta", "meat", "cake");
    drinkList = Arrays.asList("water", "orange juice", "Capri-sun");
  }

  public List<String> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<String> foodList) {
    this.foodList = foodList;
  }

  public List<String> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<String> drinkList) {
    this.drinkList = drinkList;
  }
}
