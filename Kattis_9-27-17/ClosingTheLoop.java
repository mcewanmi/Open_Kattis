import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosingTheLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int x =0; x< N; x++){
		
			int segs = sc.nextInt();
			
			String colors= "";
			for (int y=0; y<segs; y++)
				colors = colors.concat(" " + sc.next());
			
			List<Integer> red = new ArrayList<Integer>();
			List<Integer> blue = new ArrayList<Integer>();
			
			
			for (String rope : colors.split(" ")){
				if (rope.endsWith("R"))
					red.add(Integer.parseInt(rope.substring(0, rope.length()-1)));
				else if (rope.endsWith("B")){
					blue.add(Integer.parseInt(rope.substring(0, rope.length()-1)));
				}
										
			}
			
			if (red.size() == 0 || blue.size() ==0)
				System.out.println("Case #"+ (x+1)+ ": 0");
			else{
				
				Collections.sort(red);
				Collections.reverse(red);
				
				Collections.sort(blue);
				Collections.reverse(blue);
				
			
				int len=0;
				char color;
				if (red.size() < blue.size())
					color = 'r';
				else
					color = 'b';
				while (red.size()>0  && blue.size()>0){
					if (color == 'r'){
						len+=red.remove(0)-1;
						color='b';
					}
					else
					{
						len+=blue.remove(0)-1;
						color='r';
					}
				}
				if (color=='r' && red.size() > 0)
					len+=red.remove(0)-1;
				else if (color=='b' && blue.size() > 0)
					len+=blue.remove(0)-1;
			
				System.out.println("Case #" + (x+1) + ": " + len);
			}
			
			
		}
		sc.close();
	}

}
