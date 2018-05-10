import java.util.Arrays;
import java.util.Scanner;
public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[3];
		in[0] = sc.nextInt();
		in[1] = sc.nextInt();
		in[2] = sc.nextInt();
		sc.nextLine();
	
		Arrays.sort(in);
		
		String order = sc.nextLine();
		int y=0;
		for (char x : order.toCharArray()){
			if (x == 'A') System.out.print(in[0]);
			else if (x == 'B') System.out.print(in[1]);
			else System.out.print(in[2]);
			y++;
			if (y != 3) System.out.print(" ");
		}
		
	}

}
