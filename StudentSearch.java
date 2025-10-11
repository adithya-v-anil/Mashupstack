import java.util.Scanner;

public class StudentSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] id = {1,2,3};
        String[] name = {"Rajesh", "Rahul", "Sruthi"};

        System.out.print("Enter Student ID: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for(int i=0;i<id.length;i++) {
            if (id[i] == searchId) {
                System.out.println("Student Name: " +name[i]);
                found = true;
            }
        }
        if(!found) {
            System.out.println("No student found with ID " +searchId);
        }
        sc.close();
    } 
}
