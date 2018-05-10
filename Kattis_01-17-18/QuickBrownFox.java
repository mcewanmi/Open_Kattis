import java.util.Arrays;
import java.util.Scanner;
public class QuickBrownFox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numIn = Integer.parseInt(sc.nextLine());
		
		for (int z=0; z<numIn; z++){
				
			char[] chk = new char[26];
	
			for (int x=97; x<123; x++){
				chk[x-97] = (char)x;
			}
		
			
			String in = sc.nextLine();
			in = in.toLowerCase();
			in = in.replaceAll("[^a-z]+", " ");
			int y=0;

					while (y < 26){
						if (in.contains(String.valueOf(chk[y]))){
							in = in.replace(chk[y], ' ');
							chk[y]=' ';
							}
						
						y++;
					}
					if (Arrays.toString(chk).replaceAll("\\W", "").equals(""))
							System.out.println("pangram");
					else{
						System.out.print("missing ");
					for (int x = 0; x <chk.length; x++)
						if (chk[x] != ' ')
							System.out.print(chk[x]);
					System.out.println();
				}
			}
		sc.close();
		
	}

}
