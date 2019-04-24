package comparableDomino;

public class Domino implements Comparable<Domino> {
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
  public int compareTo(Domino otherDomino) {
    int result = Integer.compare(this.left, otherDomino.left);
    if (result != 0) {
      return result;
    }
    if (result == 0) {
      result = Integer.compare(this.right, otherDomino.right);
    }
    return result;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
}


