package people;

public class Person {
  private String name;
  private int age;
  private String gender;

  public Person( String name, int age, String gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public Person() {
    this.age = 30;
    this.name = "Jane";
    this.gender = "female";
  }

  public void introduce() {
    System.out.println("Hi Im " + name + ", a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is to live for the moment");
  }


  public void setAge() {
    this.age= age;
  }

  public int getAge() {
    return age;
  }

  public void setName() {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public  void setGender() {
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }
}
