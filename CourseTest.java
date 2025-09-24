class Course {

     public String courseName;
     public int durationWeeks;
     public static int courseCount = 0;
     public final String trainingCenterName = "MashupStack";

    Course() {

        courseName = "Java Programming";
        durationWeeks = 20;
        courseCount++;

    }  

    Course(String name, int weeks) {
        courseName = name;
        durationWeeks = weeks;
        courseCount++;

    }

    class CourseMaterial {

         public void showMaterial() {
            System.out.println("Materials provided for this course.");
        }
    }
}
 
public class CourseTest {
    public static void main(String args[]){
        Course c1 = new Course();
        Course c2 = new Course("Python Programming", 16);

        System.out.println("Course 1: " + c1.courseName + ", " + c1.durationWeeks + " weeks, " + c1.trainingCenterName);
        c1.new CourseMaterial().showMaterial();

        System.out.println("\nCourse 2: " + c2.courseName + ", " + c2.durationWeeks + " weeks, " + c2.trainingCenterName);
        c2.new CourseMaterial().showMaterial();

        System.out.println("\nTotal courses created: " + Course.courseCount);
    }
}