import java.util.ArrayList;
import java.util.Scanner;
public class Tajna {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String in = sc.next();
		
		sc.close();
		
		int len = in.length(), r=0, c=len+1;
		ArrayList<Integer> row= new ArrayList<Integer>();
		ArrayList<Integer> col= new ArrayList<Integer>();
		
		//if (c ==1 || c % 2 != 0)
		//	col.add(c);
		//else{
		if (Math.sqrt(len) == (int)Math.sqrt(len))
			while (c >Math.sqrt(len)){
				c--;
				if (len % c == 0) col.add(c);
				
			}
		//else
		//}
		
		
		for (int x=0; x<col.size(); x++)
			row.add(len/col.get(x));
		
		System.out.println(row + " " + r + " " + col);
		
		int high=0;
		for (int x=0; x<row.size(); x++)
			if (row.get(x) > high)
				high=row.get(x);
	
	

		//r=row.get(row.size()-1);
		r=high;
		
		
		c=col.get(row.indexOf(r));
	
		
	//c=col.get(col.size()-1);
	
	
	char rows[][] = new char[r][c];
	int ctr=0;
	
	for (int y=0; y<r; y++){
		for (int x=0; x<c; x++, ctr++){
			rows[y][x]=in.charAt(ctr);
		}
	}
	
	/*
	for (int y=0; y<r; y++)
		for (int x=0; x<c; x++)
			System.out.print(rows[y][x]);
	System.out.println();
	*/
	
	String out= new String();
	
	for (int x=0; x<c; x++)
		for (int y=0; y<r; y++)
			out+=rows[y][x];
	
	
	System.out.println(out);
	
	}

}
