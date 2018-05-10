import java.util.Scanner;
public class SimonSays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ins = Integer.parseInt(sc.nextLine());
		
		
		for (int x=0; x<ins; x++){
			String in = sc.nextLine();
			if (in.contains("Simon says"))
				System.out.println(in.substring(10));
				
		}
		
		
	}

}
