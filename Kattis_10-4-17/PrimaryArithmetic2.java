import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class PrimaryArithmetic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		
		while (!in.equals("0 0")){
			
			
			
			List<Integer> val1 = new ArrayList<Integer>();
			List<Integer> val2 = new ArrayList<Integer>();
			
			for (char x : in.substring(0, in.indexOf(" ")).toCharArray())
				val1.add((int) x - 48);
			
			for (char x : in.substring(in.indexOf(" ")+1, in.length()).toCharArray())
				val2.add((int) x - 48);
			
			//System.out.println(val1);
			//System.out.println(val2);
			
			if (val1.size() == 1 && val2.size()==1 && val1.get(0)+val2.get(0) < 10)	//if the numbers don't add up beyond 9
				System.out.println("No carry operation.");
			else
			{
				int carryOps=0;
				int carry=0;
				if (val2.size() > val1.size()){
					List<Integer> val3 = val1;
					val1 = val2;
					val2 = val3;
				}
				while (val2.size() < val1.size())
					val2.add(0, 0);
				
				int y=val2.size()-1;
				int x=val1.size()-1;
				while (x > -1){ //if the numbers add up beyond 9
					
					if (val1.get(x) +val2.get(y) + carry < 10){
						val1.set(x, val1.get(x)+val2.get(y)+carry);
						//System.out.println(val1);
					carry=0;	
					}
					else{
						//System.out.println(val1);
						if (x ==0){
							val1.add(0, 1);
							val1.set(1, (val1.get(1)+val2.get(y))%10);
							//x++;
							//carryOps++;
						//Integer.valueOf(String.valueOf(val1.get(1)+val2.get(y)).charAt(1)-48)+carry);
						}
						else{
							//String strVal = String.valueOf(val1.get(x)+val2.get(y));
							//char charVal = strVal.charAt(1);
							//int intVal = Integer.valueOf(charVal)-48;
							int intVal = (val1.get(x) + val2.get(y)) % 10;
							int finalVal = intVal+carry;
							//System.out.println(intVal + " " + finalVal);
							//val1.set(x, Integer.valueOf(String.valueOf(val1.get(x)+val2.get(y)).charAt(1)-48)+carry);
						val1.set(x, finalVal);
						}
							//System.out.println(val1);
						carry=1;
						carryOps++;
						//System.out.println(val1);
					}
					x--;
					if (y > 0)
					y--;
					else
						break;
				}
				if (carryOps > 1)
				System.out.println(carryOps + " carry operations.");
				else if (carryOps == 1)
					System.out.println("1 carry operation.");
				else
					System.out.println("No carry operation.");
			}
			
			in=sc.nextLine();
		}
	}

}
