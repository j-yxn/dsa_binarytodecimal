import java.util.*;

public class convertstring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input any binary number: ");
		System.out.print("The demical integer is " + binaryConversion(s.nextLine()) + ".");
	}
		
	public static int binaryConversion(String b) {
		int total = 0;
		int length = b.length() - 1;
		for(int i = 0; i <= b.length() - 1; i++){
			int p = Integer.parseInt(b.substring(i, i + 1));
			total += p * Math.pow(2, length);
			length--;
		}
		return total;		
	}
}
