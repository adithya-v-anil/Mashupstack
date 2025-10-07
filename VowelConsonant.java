import java.util.Scanner;
public class VowelConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = sc.next().charAt(0);
        if ( alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet+ " is vowel.");
        }
        else{
             System.out.println(alphabet+ " is consonant.");
        }
       sc.close();
    }
}
