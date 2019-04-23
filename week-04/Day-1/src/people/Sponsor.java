package people;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;


  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("Hi Im " + getName() + " a " + getAge() + " year old "
            + getGender() + " who represents " + company + " and hired " +
            hiredStudents + " Students so far.");
  }

  public void hire() {
    this.hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant software developers.");
  }


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }
}
