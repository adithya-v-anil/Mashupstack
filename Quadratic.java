public class Quadratic {
    public static void main(String args[]) {
        double a = 10;
        double b = 4;
        double c = 6;
        double root1, root2;
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            root2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("The first root is: " +root1);
            System.out.println("The second root is: " +root2);
        }
        else if (discriminant==0) {
            root1 = root2 = -b / 2 * a;
            System.out.println("The first and second root is: " +root1);
        }
        else {
            root1 = -b / 2 * a;
            root2 = Math.sqrt(-discriminant) / 2 * a;
            System.out.println("The first root is: " +root1);
            System.out.println("The second root is: " +root2);
        }
    }
}
