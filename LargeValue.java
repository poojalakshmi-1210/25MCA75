package operators;
import java.util.Scanner;

public class LargeValue {

	

	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Input 4 integers
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = sc.nextInt();
		        int d = sc.nextInt();

		        // Find maximum using ternary operator
		        int max = (a > b ? a : b);
		        max = (max > c ? max : c);
		        max = (max > d ? max : d);

		        // Output
		        System.out.println("Maximum: " + max);
		    }
}
		

	

