import java.util.Scanner;
public class HissingMicrophone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] in = sc.nextLine().toCharArray();
		boolean hiss = false;
		for (int x=0; x< in.length-1; x++){
			if (in[x] == 's' && in[x+1] == 's')
				hiss=true;
		}

		
		if (hiss)
			System.out.println("hiss");
		else
			System.out.println("no hiss");
	
		sc.close();
	}

}
