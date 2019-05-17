package com.shop.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {
  List<ShopItem> listOfItems = new ArrayList<>();

  public List<ShopItem> available(List<ShopItem> listOfItems) {
    List<ShopItem> availableList = listOfItems.stream()
            .filter(shi -> shi.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    return availableList;
  }

  public List<ShopItem> cheapFirst(List<ShopItem> listOfItems) {
    List<ShopItem> cheapFirstList = listOfItems.stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList());
    return cheapFirstList;
  }

  public List<ShopItem> nikeInIt(List<ShopItem> listOfItems) {
    List<ShopItem> nikeInItList = listOfItems.stream()
            .filter(shopItem -> shopItem.getDescription().contains("nike"))
            .collect(Collectors.toList());
    return nikeInItList;
  }

  public long stockAverage(List<ShopItem> listOfItems) {
    long average = listOfItems.stream()
            .mapToLong(ShopItem::getPrice).sum() / listOfItems.size();
    return average;
  }

  public String mostExpensive(List<ShopItem> listOfItems) {
    ShopItem mostExpensiveItem = listOfItems.stream()
            .filter(shopItem -> shopItem.getQuantityOfStock()!=0)
            .max(Comparator.comparing(ShopItem::getPrice))
            .get();
    return mostExpensiveItem.getName();
  }
}
