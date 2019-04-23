package people;

        import java.util.ArrayList;
        import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();

  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(students.size());
    System.out.println(mentors.size());
    System.out.println(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
