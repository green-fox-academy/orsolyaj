package com.shop.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {
  List<ShopItem> listOfItems = new ArrayList<>();

  public List<ShopItem> available(List<ShopItem> listOfItems) {
    List<ShopItem> availableList = listOfItems.stream()
            .filter(shi -> shi.getQuantityOfStock()>0)
            .collect(Collectors.toList());
    return availableList;
  }

  public List<ShopItem> cheapFirst(List<ShopItem> listOfItems) {
    List<ShopItem> cheapFirstList = listOfItems.stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList());
    return cheapFirstList;
  }
}
