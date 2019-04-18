import java.util.List;

public class Farm {
  List<Animal> animalList;
  int slots;

  public void breed() {
    if (this.animalList.size() < this.slots) {
      this.animalList.add(new Animal());
    }
  }

  public void slaughter() {
    if (this.animalList.size() > this.slots) {
      Animal victim = this.animalList.get(0);
      for (int i = 0; i < this.animalList.size(); i++) {
        if (victim.hunger < this.animalList.get(i).hunger) {
          victim = this.animalList.get(i);
        }
      } animalList.remove(victim);
    }
  }
}
