import java.util.Arrays;
import java.util.Scanner;
public class Multigram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.nextLine().toCharArray();
		sc.close();
		boolean end = false;
		String out = "";
		for (int x=in.length/2; x> 0; x--){ //letter-position not the concern here, looking for potential segment sizes for numerous mulitgrams
			if (in.length % x == 0){
				char[] mult = Arrays.copyOfRange(in, 0, x);
				Arrays.sort(mult);
				for (int y=x; y< in.length; y+=x){
					char[] comp = Arrays.copyOfRange(in, y, x+y);
					Arrays.sort(comp);
					if (!Arrays.equals(mult , comp)){
						end=true;
					break;
					}
					
				}
			if (!end) out = Arrays.toString(Arrays.copyOfRange(in, 0, x)).replace("[", "").replace("]", "").replaceAll(",", "").replaceAll(" ", ""); 
			end = false;
			}
		}

		if (!out.equals(""))
			System.out.println(out);
		else
			System.out.println(-1);
		
	}

}
