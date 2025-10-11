public class Largest {
    public static void main(String args[]){

    int n1 = 10;
    int n2 = 30;
    int n3 = 20;

    if (n1>=n2) {
        if (n1>=n3) {
            System.out.println(n1+ " is the largest among three numbers.");
        }
        else {
            System.out.println(n3+ " is the largest among three numbers.");
        } 
    }
        else if (n2>=n3) {
            System.out.println(n2+ " is the largest among three numbers.");
        }
        else {
            System.out.println(n3+ " is the largest among three numbers.");
        }
}
}