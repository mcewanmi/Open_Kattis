import java.math.BigInteger;
import java.util.Scanner;

public class nnnnn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		BigInteger in = new BigInteger(sc.nextLine());
		
		//System.out.println(in.divide(BigInteger.valueOf(in.toString().length())));
		BigInteger temp = in;
		BigInteger r=BigInteger.ZERO; 
		while (!temp.equals(BigInteger.ZERO)){
			r=r.add(BigInteger.ONE);
			temp=temp.divide(BigInteger.valueOf(10));
			
			
		}
		
		BigInteger d = BigInteger.ONE;
		BigInteger m = BigInteger.ONE;
		while (!d.equals(in)){
			
			m=m.multiply(BigInteger.valueOf(2));
			while (m.multiply(r).compareTo(in) > 0){
				m=m.subtract(BigInteger.valueOf(1));
				//System.out.println(m);
			}
			d = m.multiply(r);
			//System.out.println("d "+d);
		}
		
		//System.out.println(in.divide(r));
		System.out.println(m);
		
		sc.close();
	}

}
