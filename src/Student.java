public class Student {
  int rating;
  private String name;
  private static int totalRating = 0;
  private static int studentsCount = 0;
  private static double avgRating = 0.0;

  public Student(String name) {
    this.name = name;
    Student.studentsCount++;
  }

  public Student(String name, int rating) {
    this.name = name;
    this.rating = rating;
    Student.studentsCount++;
  }

  public static double getAvgRating() {
    if (studentsCount == 0) {
      return 0;
    } else {
      avgRating = (double) totalRating / studentsCount;
      return avgRating;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating +=rating;
  }

  public boolean betterStudent(Student student) {
    if (this.getRating() >= student.getRating()) {
      return true;
    } else
    return false;
  }

  public void changeRating(int rating) {
    totalRating -=this.rating;
    this.rating = rating;
    totalRating +=rating;
  }

  public static void removeStudent(Student student) {
    student.totalRating = 0;
    student.studentsCount = 0;
    student.avgRating = 0.0;
  }

  @Override
  public String toString() {
    return "Student's name is: " + this.getName() + " and student's rating is : " + this.getRating();
  }
}
