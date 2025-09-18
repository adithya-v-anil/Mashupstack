import java.util.Scanner;
import java.time.LocalDateTime;

public class attendance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " +(i + 1)+ ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks of " +names[i]+ ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 

            total+= marks[i];
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.print(names[i]+ "-" +marks[i]);

            if (marks[i] < 35) {
                System.out.print(" - Needs Improvement");
            }
            System.out.println();
        }

        double average = (double) total / n;
        System.out.println("\nAverage Marks: " + average);

        System.out.println("Program ended at: " + LocalDateTime.now());

        sc.close();
    }
}

