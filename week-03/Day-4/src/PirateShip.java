import java.util.ArrayList;
import java.util.List;

public class PirateShip {
  List<Pirate> crew;
  Pirate captain;


  public PirateShip() {
    this.crew = new ArrayList<>();
  }

  public void fillShip() {
    this.crew.add(new Pirate());
    if (crew.contains(captain) == false) {
      this.crew.add(captain);
    }
  }
  public void piratesAlive() {
    int piratesAlive = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).life == true) {
        piratesAlive++;
      }
    }
  }

  public void details() {
    System.out.println("Captain is alive: " + captain.life + "Captain rum level: " + captain.rumlevel);
    int piratesAlive = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).life == true) {
        piratesAlive++;
      }
    }
    System.out.println("Pirates alive: " + piratesAlive);
  }

  public void battle(PirateShip otherShip) {
    for (int i; i++) {

    }
  }


}
