import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrimaryArithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input= sc.nextLine();
		
		while (!input.equals("0 0")){
			String[] in = new String[2];
			in=input.split(" ");
			
			if (in[1].length() > in[0].length()){
				String temp = in[0];
				in[0] = in[1];
				in[1] = temp;
			}
		
			//char[] in1 = in[0].toCharArray();
			List<Integer> in1 = new ArrayList<Integer>();
			for (char x : in[0].toCharArray())
				in1.add(x-48);
			
			List<Integer> in2 = new ArrayList<Integer>();
			for (char x : in[1].toCharArray())
				in2.add(x-48);
			
			System.out.println(in1);
			System.out.println(in2);
			
			int y=in2.size()-1, carryOps=0;
			int x=in1.size()-1;
			//for (int x=in1.size()-1; x> -1; x--){
			while (x > -1){
				boolean car=false;
				//System.out.println(in1.get(x) + " " + in2.get(x));
				if (in1.get(x)+in2.get(y) > 10){
					if (x == 0){
						in1.add(x, 1);
						x++;
						}
					in1.add(in1.get(x)+in2.get(y));
					x++;
					System.out.println(Integer.valueOf(String.valueOf(in1.get(x)).charAt(1))-48);
					in1.set(x, Integer.valueOf(String.valueOf(in1.get(x)).charAt(1))-48);
					
					carryOps++;
					car=true;
					System.out.println(in1);
					x--;
				
				
					
					int z=x-1;
				while (car && z>0){
					if (in1.get(z) != 9){ 
					//in1.set(z, (char) (Integer.valueOf(in1.get(z))+1));
						in1.set(z, in1.get(z)+1);
					car=false;
					}
					else{
						in1.set(z, 0);
						z--;
						carryOps++;
						
					}
				}
				}
				else
					in1.set(0, in1.get(0)+in2.get(0));
			x--;
			}
			
			//String out = in1.toString().replaceAll(",", "").replace("[", "").replace("]", "");
			System.out.println("in1 " + carryOps);
			
			input= sc.nextLine();
		}
		sc.close();
	}
}
