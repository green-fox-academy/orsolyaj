package cloneable;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("John", 20, "male", "BME");
    Student JohnTheClone = student.clone();
  }
}
