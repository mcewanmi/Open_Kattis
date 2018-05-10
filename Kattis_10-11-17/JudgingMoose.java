import java.util.Scanner;
public class JudgingMoose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt(), r = sc.nextInt();
		sc.nextLine();
		
	
		if (l==r && l > 0)
			System.out.println("Even "+ (l*2));
		else if	(l <r)
			System.out.println("Odd " + (r*2));
		else if (r < l)
			System.out.println("Odd " + (l*2));
		else if (l==0 && r==0)
			System.out.println("Not a moose");
		
		
		sc.close();
	}

}
