import java.util.Scanner;
public class Tarifa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int megaM = Integer.parseInt(sc.nextLine());
		int numM = Integer.parseInt(sc.nextLine());
		long sum=0;
		for (int x=0; x<numM; x++){
			sum+=(megaM-Integer.parseInt(sc.nextLine()));
		}
		
		System.out.println(sum+megaM);
		
		
		
		sc.close();
	}

}
