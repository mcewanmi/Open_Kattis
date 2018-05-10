import java.util.Scanner;
public class PalindromicPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int runs = Integer.parseInt(sc.nextLine());
		
		
		
		for (int x=0; x<runs; x++){
			char[] in = sc.nextLine().toCharArray();
			char[] inLow = in;
			char[] inHigh=in;
			while (!(inLow[3] == inLow[2] && inLow[4]==inLow[1] && inLow[5]==inLow[0]) && 
					!(inHigh[3] == inHigh[2] && inHigh[4]==inHigh[1] && inHigh[5]==inHigh[0])){
						
						int val = Integer.parseInt(String.valueOf(inLow[0]))*(int)Math.pow(10.0,5.0);
						val+= Integer.parseInt(String.valueOf(inLow[1]))*(int)Math.pow(10.0,4.0);
						val+=Integer.parseInt(String.valueOf(inLow[2]))*(int)Math.pow(10.0,3.0);
						val+=Integer.parseInt(String.valueOf(inLow[3]))*(int)Math.pow(10.0,2.0);
						val+=Integer.parseInt(String.valueOf(inLow[4]))*(int)Math.pow(10.0,1.0);
						val+=Integer.parseInt(String.valueOf(inLow[5]));
						if (val > 100001) val--;
						
						int val2 = Integer.parseInt(String.valueOf(inHigh[0]))*(int)Math.pow(10.0,5.0);
						val2+= Integer.parseInt(String.valueOf(inHigh[1]))*(int)Math.pow(10.0,4.0);
						val2+=Integer.parseInt(String.valueOf(inHigh[2]))*(int)Math.pow(10.0,3.0);
						val2+=Integer.parseInt(String.valueOf(inHigh[3]))*(int)Math.pow(10.0,2.0);
						val2+=Integer.parseInt(String.valueOf(inHigh[4]))*(int)Math.pow(10.0,1.0);
						val2+=Integer.parseInt(String.valueOf(inHigh[5]));
						if (val2 < 999999) val2++;
						
						inLow = String.valueOf(val).toCharArray();
						inHigh = String.valueOf(val2).toCharArray();
		//	System.out.println("Low: "+ String.valueOf(inLow));
		//	System.out.println("High "+ String.valueOf(inHigh));
			}
			if (inLow[3] == inLow[2] && inLow[4]==inLow[1] && inLow[5]==inLow[0])
				System.out.println(String.valueOf(inLow));
			else
				System.out.println(String.valueOf(inHigh));
		}
		sc.close();
	}

}
