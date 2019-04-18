import java.util.ArrayList;
import java.util.List;

public class Domino {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> sortedDominoes = new ArrayList<>();
    sortedDominoes.add(dominoes.get(0));

      for (int j = 0; j < dominoes.size() - 1 ; j++) {
        for (int i = 0; i < dominoes.size() ; i++) {
          if (sortedDominoes.get(j).getRightSide() == dominoes.get(i).getLeftSide()) {
            sortedDominoes.add(dominoes.get(i));
          }
        }
      }

    System.out.println(dominoes);


    System.out.println(sortedDominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
