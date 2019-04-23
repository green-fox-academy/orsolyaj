package garden;

public class Plant {
  private String color;
  private float waterAmount;
  private boolean needsWatering;
  private int waterTreshold;

  public Plant() {
    this.color = " green ";
    this.waterAmount = 0;
    this.waterTreshold = 0;
  }

  public Plant(String color) {
    this.color = color;
    this.waterAmount = 0;
  }

  public boolean needsWater() {
    if (this.getWaterAmount() <= waterTreshold) {
      setNeedsWatering(true);
    } else {
      setNeedsWatering(false);
    }
    return needsWatering;
  }

  public int getWaterTreshold() {
    return waterTreshold;
  }

  public void setWaterTreshold(int waterTreshold) {
    this.waterTreshold = waterTreshold;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(float waterAmount) {
    this.waterAmount = waterAmount;
  }

  public boolean isNeedsWatering() {
    return needsWatering;
  }

  public void setNeedsWatering(boolean needsWatering) {
    this.needsWatering = needsWatering;
  }
}
