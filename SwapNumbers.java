public class SwapNumbers {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        System.out.println("--BEFORE SWAP--");
        System.out.println("The first number is : " +first);
        System.out.println("The second number is : " +second);

        int temporary = first;
        first = second;
        second = temporary;

        System.out.println("\n--AFTER SWAP--");
        System.out.println("The first number is : " +first);
        System.out.println("The second number is : " +second);

    }
}
