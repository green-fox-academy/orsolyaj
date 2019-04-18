public class Pirate {
  int rumlevel;
  boolean life;
  int parrot;

  public Pirate() {
    this.rumlevel = 0;
    this.life = true;
    this.parrot = 1;
  }

  public void howsItGoingMate() {
    if (life == true && this.rumlevel <= 4) {
      System.out.println("Pour me anudder");
    } else if (life == false) {
      System.out.println("he ded");
    } else {
      System.out.println("Aarghh, I'ma Pirate. How d'ya d'ink its goin...");
    }
  }

  public void die() {
    this.life = false;
  }

  public void brawl(Pirate secondPirate) {
    if (this.life == false && secondPirate.life == false ) {
      System.out.println("they are ded");
    } else if (this.life == false) {
      System.out.println("winner " + secondPirate);
    } else if (secondPirate.life == false) {
//      System.out.println("winner " + this.Pirate);
    } else {
      System.out.println("They passed out");
    }
  }

}
