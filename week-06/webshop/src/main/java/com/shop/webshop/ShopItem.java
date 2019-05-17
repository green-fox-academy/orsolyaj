package com.shop.webshop;

public class ShopItem {
  String name;
  String description;
  long price;
  long quantityOfStock;

  public ShopItem(String name, String description, long price, long quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public long getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(long quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }
}
