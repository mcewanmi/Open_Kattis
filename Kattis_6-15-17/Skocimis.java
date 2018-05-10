import java.util.Scanner;
public class Skocimis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), ctr=0;
	
		while ((b-a>1 && c-b>1 ) || (a+b+c)/3.0 != b && (a+b+c)/3.0 != a && (a+b+c)/3.0 != c){
			if (a < b  && b < c) //abc
				if (b -a > c - b)
					c=a+1;
				else
					a=c-1;
			else if (b < a && a < c) //bac
				if (a-b > c-a)
					c=b+1;
				else
					b=c-1;
			else if (a < c && c < b) //acb
				if (c-a > b-c)
					b=a+1;
				else
					a=b-1;
			else if (b < c && c < a) //bca
				if (c-b > a-c)
					a=b+1;
				else
					b=a-1;
			else if (c < a && a < b) //cab
				if (a-c > b-a)
					b=c+1;
				else
					c=b-1;
			else if (c <b && b < a) //cba
				if (b-c > a-b)
					a=c+1;
				else
					c=a-1;
			
			//System.out.println(a + " " + b + " " + c);
			ctr++;
		}
		System.out.println(ctr);
		
		sc.close();
	}

}