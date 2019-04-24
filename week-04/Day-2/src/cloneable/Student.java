package cloneable;


public class Student extends Person implements Cloneable{
    private String prevousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String prevousOrganization) {
      super(name, age, gender);
      this.prevousOrganization = prevousOrganization;
      this.skippedDays = 0;
    }

    public Student() {
      super();
      this.prevousOrganization = "School of life";
      this.skippedDays = 0;

    }

    public Student clone() {
      Student studentClone = new Student(getName(), getAge(), getGender(), getPrevousOrganization());
      return studentClone;
    }

    public void getGoal() {
      System.out.println("Be a junior software developer.");
    }

    public void introduce() {
      System.out.println("Hi, Im " + getName() + " a " + getAge() +
              "from" + prevousOrganization + " who skipped " + skippedDays );
    }

    public void skipDays(int days) {
      this.skippedDays = skippedDays + days;
    }

    public String getPrevousOrganization() {
      return prevousOrganization;
    }

    public void setPrevousOrganization(String prevousOrganization) {
      this.prevousOrganization = prevousOrganization;
    }

    public int getSkippedDays() {
      return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
      this.skippedDays = skippedDays;
    }


  }
