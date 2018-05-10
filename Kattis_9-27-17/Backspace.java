import java.util.Scanner;

public class Backspace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		StringBuilder line = new StringBuilder(in);
		
		int ct = in.length() - in.replaceAll("<", "").length();
	
		int x=0;
		int loc = 0, loc2=line.length();
		int y =0, z=0;
		StringBuilder out=new StringBuilder();
		//long start = 0;
		//long stop = 0;
		//start = System.nanoTime();
		while (line.indexOf("<", 0) != -1 &&  x < ct){
			loc=line.indexOf("<", loc-y);
			loc2=line.lastIndexOf("<",loc2);
			
			while (y+loc < loc2-z && line.charAt(loc+y) == '<')
				y++;
			while (loc2-z > y+loc && line.charAt(loc2-z) == '<')
				z++;
			
			
			if (loc != -1 && loc+y==loc2+1){
				//y=1;
				//while (y+loc < line.length()-1 && line.charAt(loc+y) == '<')
				//	y++;
				
				out=new StringBuilder(line.substring(0, loc-y));
				out.append(line.substring(loc+y,line.length()));
				line=out;
			}
			else{
				//z=1;
				
				out=new StringBuilder(line.substring(0, loc-y));
				out.append(line.substring(loc+y, loc2-z));
				out.append(line.substring(loc2+1, line.length()));
				line=out;
			}
				
			x++;
		}
		//stop=System.nanoTime()-start;
		System.out.println(out.toString());// + " " + stop);
		
		scan.close();
	}

}
