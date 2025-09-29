import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
     public static void main(String args[]) {
         String message = "Hello, you can contact me at 9400639689 or at my office 1234567890.";
         findPhoneNumbers(message);
    }

 @SuppressWarnings("unchecked")
    public static void findPhoneNumbers(String message) {
    
        Pattern pattern = Pattern.compile("\\b\\d{10}\\b");
        Matcher matcher = pattern.matcher(message);
        boolean found = false;
        
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

      if (!found) {
            System.out.println("No phone numbers found.");
        }
}
}