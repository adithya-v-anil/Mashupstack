class Student {
    private String name;
    private int rollNo;
    private double percentage;

 public String getName() { 
    return name;
 }

 public void setName(String name) {
    this.name = name;
 }

  public int getRollNo() { 
    return rollNo;
 }

 public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
 }

  public double getPercentage() { 
    return percentage;
 }

 public void setPercentage(double percentage) {
    this.percentage = percentage;
 }
}

public class StudentTest {
    public static void main(String args[]) { 

        Student s1 = new Student();
        s1.setName("Adithya");
        s1.setRollNo(2);
        s1.setPercentage(84.51);
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Percentage: " + s1.getPercentage() + "%");
} 
}

