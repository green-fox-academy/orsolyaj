import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class PirateShip {
  List<Pirate> crew;
  Pirate captain;


  public PirateShip() {
    this.crew = new ArrayList<>();
  }

  public void fillShip() {
    double x = (int) Math.random() * 10;
    for (int i = 0; i <= x; i++) {
      this.crew.add(new Pirate());
    }
    this.crew.add(captain);
  }

  public int piratesAlive() {
    int piratesAlive = 0;
    for (int i = 0; i < this.crew.size(); i++) {
      if (this.crew.get(i).life == true) {
        piratesAlive++;
      }
    } return piratesAlive;
  }

  public void details() {
    System.out.println("Captain is alive: " + captain.life + "Captain rum level: " + captain.rumlevel);
    System.out.println("Pirates alive: " + this.piratesAlive());
  }

  public void battle(PirateShip otherShip) {
    if ( piratesAlive(this.crew) + )



    }
  }

