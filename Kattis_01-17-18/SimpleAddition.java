import java.math.BigInteger;
import java.util.Scanner;
public class SimpleAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger in1 = new BigInteger(sc.nextLine());
		BigInteger in2 = new BigInteger(sc.nextLine());
		
		
		System.out.println(in1.add(in2));
		

	}

}
