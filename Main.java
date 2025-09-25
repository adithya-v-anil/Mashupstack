import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
         File file = new File("assignment.txt");
         String content = "Java File Handling Practice";

     try {

      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }

      FileWriter output = new FileWriter(file);
            output.write(content);
            output.close();
            System.out.println("Data is written to the file.");
            
       
      FileReader input = new FileReader(file);
             int i;
             System.out.println("Data in the file:");
             while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
             input.close();
             System.out.println();

    if (file.delete()) {
                System.out.println("File deleted successfully: " + file.getName());
            } 
              else {
                System.out.println("Failed to delete the file.");
            }
        }

     catch(Exception e) {
       System.out.println("An error occurred: " + e.getMessage());
    }

}
}
