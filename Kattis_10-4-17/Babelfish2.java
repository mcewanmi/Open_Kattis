import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Babelfish2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//List<String> inEng = new ArrayList<String>();
		//List<String> inFor = new ArrayList<String>();
		String[] in = new String[2];
		Map<String, String> dict = new HashMap<String, String>();
		int n=0;
		
		String input = new String();
		
		while (sc.hasNextLine()){
			input = sc.nextLine();
			if (!input.equals("")){
				if (input.contains(" ")){
					 in = input.split(" ");
					 dict.put(in[1], in[0]);
					
				}
				else {
					if (dict.containsKey(input))
						System.out.println(dict.get(input));
					else
						System.out.println("eh");
				}
			}
			else 
				{
				n++;
				if (n==2)
					break;
			}
		}

		
	
		sc.close();
		
		
	}

}
