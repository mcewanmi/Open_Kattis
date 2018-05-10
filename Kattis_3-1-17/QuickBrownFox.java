/*import java.util.*;
public class QuickBrownFox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int phrases = sc.nextInt();
		
		String phrase[] = new String[phrases];
		String miss = "missing ";
		sc.nextLine();
		for (int x=0; x<phrases; x++){
			boolean alpha[] = new boolean[26];
			
			 phrase[x] = sc.nextLine();
			phrase[x]=phrase[x].toLowerCase();
			
			for (int y=0; y<phrase[x].length(); y++){
				if (phrase[x].charAt(y) >=97 && phrase[x].charAt(y) <=122)
					alpha[(phrase[x].charAt(y)-97)] = true; 
			}
				
			for (int y=0; y<alpha.length; y++)
				if (alpha[y]==false)
					miss+=(char)(y+97);
			
			
			if (miss=="missing ")
				System.out.println("pangram");
			else
				System.out.println(miss);
			
			miss="missing ";
		}
		
		sc.close();
	}

}
*/
