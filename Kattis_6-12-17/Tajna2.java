import java.util.ArrayList;
import java.util.Scanner;


public class Tajna2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.next();
		
		
		
		if (in.length() % 2 !=0)
			System.out.println(in);
		else{
			ArrayList<Integer> divs =new ArrayList<Integer>();
			
			int r=0, c=0, ctr=0, ctr2=0;
			
			for (int x=in.length(); x>0; x--){
				if (in.length() % x == 0){
					divs.add(x);
					ctr2++;
				
					if (( divs.size() > 0 && divs.get(ctr2-1) * divs.get(ctr2-1) == in.length()) ||( divs.size()>1 &&  divs.get(ctr2-2) * divs.get(ctr2-1) == in.length())){
						r=divs.get(ctr2-1);
						c=in.length()/r;
						break;
					}
				}
			}
		
			char[][] cols = new char[r][c];
			
			for (int x=0; x<r; x++){			
				for (int y=0; y<c; y++, ctr++){
					cols[x][y]=in.charAt(ctr);
					
				}
			//System.out.println(cols[x]);
			}
			
			String out=new String();
			
			//System.out.println(c + " " + r);
			
			for (int x=0; x<c; x++){			
				for (int y=0; y<r; y++){
					//System.out.println(cols[y][x]);
					out += cols[y][x];
					//System.out.println(out);
				}
			}
		
			System.out.println(out);
		}
	
	}

}
