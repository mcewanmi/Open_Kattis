import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Multigram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] in = sc.nextLine().toCharArray();
		boolean multi = true;
		
	//	if (in.length % 2 == 0){
			
			int y = 0;
			int x=0;
		while (in.length % 2 == 0 && multi){
			x = in.length/2;
			
			//int z=in.length-1;
			
			//z++;
			int n=0;
			char subs[][] = new char[x][in.length/x];
			for (int m = 0; m < in.length; m+=x){
				subs[n] = Arrays.copyOfRange(in, m, m+in.length/x);
				Arrays.sort(subs[n]);
			n++;
			}
			n--;
			//char[] sub1 = Arrays.copyOfRange(in, 0, x);
	        //char[] sub2 = Arrays.copyOfRange(in, x, in.length);

            //Arrays.sort(sub1);
            //Arrays.sort(sub2);
            
			for (int m=0; m<n-1; m++){
				for (int k=1; k<n; k++){	
		            if (Arrays.equals(subs[m], subs[n])){
		               // in = Arrays.copyOfRange(in, 0, x);
		                y++;
		            }else	multi = false;
				}
			}
			
		}
		
		
	//}
		if (y == 0)
			System.out.println(-1);
		else
			System.out.println(in);
		sc.close();
	}

}
