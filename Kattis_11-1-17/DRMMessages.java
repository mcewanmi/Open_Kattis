import java.util.Scanner;
public class DRMMessages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in = sc.nextLine();
		char[] d1 = in.substring(0, in.length()/2).toCharArray();
		char[] d2 = in.substring(in.length()/2).toCharArray();
		
		//rotation values
		int rVal1=0, rVal2=0;
		for (int x=0; x<d1.length; x++){
			rVal1+=d1[x];
			rVal2+=d2[x];
		}
		//rotations
		for (int x=0; x<d1.length; x++){
			d1[x] = (char)  ((((d1[x]-65)+rVal1)%26)+65);
			d2[x] = (char)  ((((d2[x]-65)+rVal2)%26)+65);
		}
		
		//System.out.println(d1);
		//System.out.println(d2);
		
		for (int x=0; x<d1.length; x++){
			d1[x] = (char)  ((((d1[x]-65)+ (d2[x]-65)  )%26)+65);
			
		}
		
		System.out.println(d1);
		
		sc.close();
	}

}
