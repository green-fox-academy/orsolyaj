import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpieList;

  public SharpieSet() {
    this.sharpieList = new ArrayList<>();
  }

  public int countUsable() {
    int sharpiecount = 0;
    for (int i = 0; i < this.sharpieList.size(); i++) {
      if (this.sharpieList.get(i).inkAmount != 0) {
        sharpiecount++;
      }
    }
    return sharpiecount;
  }

  public void removeTrash() {
    for (int i = 0; i < this.sharpieList.size(); i++) {
      if (this.sharpieList.get(i).inkAmount == 0) {
        this.sharpieList.remove((i));
      }
    }
  }
}
