import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class BookStore {
    public static void main(String[] args) {
         File file = new File("log.txt");
         String message = "Book order placed at 14:30"; 

        try {
             if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter output = new FileWriter(file);
            output.write(message);
            output.close();
            System.out.println("Message written successfully.");
        } 

        catch (Exception e) {
            System.out.println("An error occurred while creating/writing the file. " +e.getMessage());
        }

       
        try {

            FileReader input = new FileReader(file);
            int i;
            System.out.print("Message from file: ");
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
            input.close();
            System.out.println("\nMessage read successfully.");
        } 

        catch (Exception e) {
            System.out.println("An error occurred while reading the file. " +e.getMessage());
        }
    
        if (file.delete()) {
            System.out.println("File deleted successfully. " + file.getName());
        } 
          else {
            System.out.println("Failed to delete the file.");
        }
    }
}

