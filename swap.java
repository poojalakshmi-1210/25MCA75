package operators;

public class swap {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Output
        System.out.println("a = " + a + ", b = " + b);
    }
}

