import java.util.Scanner;

public class ContactFormChecker {
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();

    System.out.println("Enter your email: ");
    String email = sc.nextLine();

    System.out.println("Enter your phone number: ");
    String phone = sc.nextLine();

    validateName(name);
    validateEmail(email);
    validatePhone(phone);

    sc.close();
    }

    public static void validateName(String name) {
        if (name.matches("[A-Z][a-zA-Z ]*")) {
            System.out.println("Name is valid.");
        } 
        else {
            System.out.println("Name is invalid. It must start with a capital letter and contain only letters or spaces.");
        }
    }

     public static void validateEmail(String email) {
        if (email.contains("@") && email.contains(".") 
            && !email.startsWith("@") && !email.startsWith(".") 
            && !email.endsWith("@") && !email.endsWith(".")) {
            System.out.println("Email is valid.");
        } 
        else {
            System.out.println("Email is invalid. It must contain '@' and '.', and cannot start or end with them.");
        }
    }

     public static void validatePhone(String phone) {
        if (phone.matches("\\d{10}")) {
            System.out.println("Phone number is valid.");
        } 
        else {
            System.out.println("Phone number is invalid. It must contain exactly 10 digits.");
        }
    }
}
