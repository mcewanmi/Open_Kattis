import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Batmanacci2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long nth = sc.nextLong();
		long k = sc.nextLong();
		List<Long> fib = new ArrayList<Long>();//long fib[] = new long[2];
		sc.nextLine();
		sc.close();

		fib.add(1L);// =1; fib[1]=1;
		fib.add(1L);
		
		int x=1;
		for (int i=1; i <= nth; i++){
			long temp = fib.get(x);
			fib.add(fib.get(x)+fib.get(x-1));// = fib[0]+fib[1];
			//fib[0] = temp;
			if (x < 4)
			x++;
			else
				x = 1;
		}
		
		System.out.println(fib.get(fib.size()-1));
	}

}
