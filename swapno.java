package operators;

public class swapno {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Swapping without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Output
        System.out.println("a = " + a + ", b = " + b);
    }
}
