package garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    Garden garden = new Garden();
    garden.addFlower(flower1);
    garden.addFlower(flower2);
    garden.addTree(tree1);
    garden.addTree(tree2);

    garden.info();
    garden.watering(40);
    garden.info();
    garden.watering(70);
    garden.info();


  }
}
