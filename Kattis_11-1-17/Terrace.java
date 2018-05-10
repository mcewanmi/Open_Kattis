import java.util.Scanner;


public class Terrace {
//Hanging Out on the Terrace
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();
		int numEvents = sc.nextInt();
		sc.nextLine();
		
		int peeps = 0;
		int denied = 0;
		for (int n = 0; n < numEvents; n++){
			String action = sc.next();
			int num = sc.nextInt();
			sc.nextLine();
			
			if (action.equals("enter"))
				if (peeps+num <=limit)
					peeps+=num;
				else
					denied++;
			else
				peeps-=num;
			
		}
		
		
		System.out.println(denied);
	}

}
