import java.util.Scanner;
public class PrintedStatues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in = Integer.parseInt(sc.nextLine());
		
		int val = 1;
		int x=1;
		while (val < in){
		val*=2;
		x++;
		}
		
		System.out.println(x);
	}

}
