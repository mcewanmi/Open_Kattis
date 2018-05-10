import java.util.Scanner;

public class PizzaCrust {

	public static void main(String[] args) {
		int c, r;
		
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt(); c=sc.nextInt();
		
		double area, areaCr, areaCh;
		
		area = Math.PI*Math.pow(r, 2);
		
		areaCr = area - Math.PI*Math.pow(r-c, 2);
		
		areaCh = area - areaCr;
		
		double ans = areaCh/area;
		
		System.out.printf("%.6f", ans*100.00);
		sc.close();
	}

}
