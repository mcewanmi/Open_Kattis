// Yin and Yang Stones
import java.util.Scanner;
class YinYangStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		int x=0;
		long start=System.nanoTime();
		long timeCheck;
		while (x<s.length() && s.length()>2){
			if (x <=s.length()-3 && s.charAt(x)==s.charAt(x+2) && s.charAt(x) != s.charAt(x+1)){
				s=s.substring(0, x+1)+s.substring(x+3,s.length());
				//System.out.println("1");
			}
			
			else if (x==s.length()-2 && s.charAt(x)==s.charAt(0) && s.charAt(x) != s.charAt(x+1)){
				s=s.substring(1, x)+s.substring(x,s.length()-2);
				//System.out.println("2");
			}
			else if (x==s.length()-1 && s.charAt(x)==s.charAt(1)&& s.charAt(x) != s.charAt(0)){
				s=s.substring(2,s.length()-1);
				//System.out.println("3");
			}
			if (x!=s.length()-1)x++;
			else x=0;
			System.out.println(s);
			timeCheck=System.nanoTime();
			if (timeCheck-start >= Math.pow(10, 8)){
				break;
			}
		}
		if (s.equals("BW") || s.equals("WB"))
			System.out.println(1);
		else
			System.out.println(0);
	//	System.out.println(s);
		sc.close();
	}
}