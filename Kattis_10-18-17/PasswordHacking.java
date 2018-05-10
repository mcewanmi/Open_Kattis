import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class PasswordHacking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Double> pass = new ArrayList<Double>();
		
		int numPass = Integer.parseInt(sc.nextLine());
		
		
		for (int x=0; x<numPass; x++){
			sc.next();
			pass.add(sc.nextDouble());
			sc.nextLine();
		}
		double attempts=0;
		
		Collections.sort(pass);
		//System.out.println(pass);
		for (int x=0; x<numPass; x++){
			attempts+=pass.get(x)*(numPass-x);
		//System.out.println(x + " " + pass.get(x) + " " + (numPass-x));
		}
		System.out.println(attempts);
		sc.close();
	}

}
