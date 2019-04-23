package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void info() {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).needsWater()) {
        System.out.println("needs water " + plants.get(i).getColor());
      } else {
        System.out.println("doesnt need water " + plants.get(i).getColor());
      }
    }

  }

  public void watering(int waterWith) {
    System.out.println("Watering with " + waterWith );
    int plantsToWater = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).needsWater()) {
        plantsToWater ++;

      }
    }
    for (int j = 0; j < plants.size(); j++) {
      if (plants.get(j).needsWater() && plants.get(j) instanceof Tree) {
        plants.get(j).setWaterAmount(plants.get(j).getWaterAmount() + (float)(waterWith / plantsToWater) * 0.4f);
      } else if (plants.get(j).needsWater() && plants.get(j)instanceof Flower) {
        plants.get(j).setWaterAmount(plants.get(j).getWaterAmount() + (float)(waterWith / plantsToWater) * 0.75f);
      } else {

      }
    }
  }

  public void addFlower(Flower flower) {
    this.plants.add(flower);
  }

  public void addTree(Tree tree) {
    this.plants.add(tree);
  }

}
