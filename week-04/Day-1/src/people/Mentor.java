package people;

public class Mentor extends Person{
  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name,age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers");
  }

  public void introduce() {
    System.out.println("Hi, Im " + getName() + " a " + getAge() +
            " year old " + getGender() + " " + level + " mentor");
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
