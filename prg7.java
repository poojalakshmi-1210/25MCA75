package Numberbased;

public class prg7 {

	public static void main(String[] args) {
		int num = 123456; 
        int oddCount = 0;
        int evenCount = 0;

        
        num = Math.abs(num);

        
        if (num == 0) {
            evenCount = 1;
        } else {
            while (num > 0) {
                int digit = num % 10;
                
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                
                num = num / 10;
            }
        }

        System.out.println("Odd = " + oddCount + ", Even = " + evenCount);

	}

}