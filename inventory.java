public class inventory {
    public static void main(String args[]){
         int stock[]= {20,15,30,0,25};
         int total=0;

         for(int i:stock){
            if (i == 0){
                System.out.println("Out of Stock");
                break;
            }
            total+=i;
         }
          System.out.println("Total quantity: " + total);

        if (total < 50) {
            System.out.println("Low Stock");
        } else if (total <= 100) {
            System.out.println("Moderate Stock");
        } else {
            System.out.println("Good Stock");
        }
}
}