package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;
  private List<Tree> trees;


  public Garden() {
    plants = new ArrayList<>();
    trees = new ArrayList<>();
  }

  public void Watering(int waterWith) {
    int plantsToWater = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).needsWater()) {
        plantsToWater ++;
      }
    }
    for (int j = 0; j < plants.size(); j++) {
      if (plants.get(j).needsWater() && plants.get(j).equals(Tree.class)) {
        plants.get(j).setWaterAmount(plants.get(j).getWaterAmount() + (float)(waterWith / plantsToWater) * 0.4f);
      } else
    }
  }


  public void addFlower(Flower flower) {
    this.plants.add(flower);
  }

  public void addTree(Tree tree) {
    this.plants.add(tree);
  }

}
