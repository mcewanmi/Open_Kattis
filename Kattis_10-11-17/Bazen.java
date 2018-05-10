import java.util.Scanner;
public class Bazen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		int a, b;
		a = input[0].equals(0) ? 0: 1;
		b = input[0].equals(0) ? 0: 1;
		
		//double a= (x <=124.99) ?  125: 0;
		//double b= (y <=124.99) ?  125: 0;
		int x=0, y=0;
		double areaD2 = 2500*2500/4.0;
		boolean end=false;
		double areaSq = 0;
		System.out.println(areaD2);
		while (y < 2500){
			while (x < 2500){
				
				if (x==0){
				//areaSq = Math.pow(y-b,2)*;
				}
				
				
			if (areaSq == areaD2)
				end=true;
			else
				x++;
			}
			if (!end){
				y++;
				x=1;}
		}
		
		System.out.println(end + " " + x+" " + y);
	}

}
