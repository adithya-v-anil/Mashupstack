class Course {
    
    public String courseName;
    public int durationWeeks;
    public int studentsEnrolled;
    public final String courseCreatorName = "CodeMentor Academy";
    public static int totalStudents = 0;

    Course (String course, int duration, int students) {
           courseName = course;
           durationWeeks = duration;
           studentsEnrolled = students;
           totalStudents+= studentsEnrolled;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + durationWeeks + " weeks");
        System.out.println("Students: " + studentsEnrolled);
        System.out.println("Creator: " + courseCreatorName);
        System.out.println();
    }

    static class Platform {
        static void showMessage() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}

public class CourseTest1 {
     public static void main(String[] args) {
        Course c1 = new Course("Java Basics", 6, 50);
        Course c2 = new Course("Python Advanced", 8, 70);

        c1.showDetails();
        c2.showDetails();

        System.out.println("Total Students: " + Course.totalStudents);
        Course.Platform.showMessage();
    }
}

