public class Counter {
  int intvalue;
  int defv;



  public Counter(int initialValue) {
    this.intvalue = initialValue;
    this.defv = initialValue;
  }
  public Counter() {
    this(0);
  }

  public void add(int number) {
    this.intvalue = intvalue + number;
  }

  public void add() {
    this.intvalue++;
  }

  public int get() {
    return this.intvalue;
  }

  public void reset() {
    this.intvalue = defv;

  }

}
