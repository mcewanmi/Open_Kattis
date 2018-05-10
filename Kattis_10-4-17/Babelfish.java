import java.util.List;
import java.util.ArrayList;

public class Babelfish {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String[] wordFor = new String[2];
		List<String[]> inDict = new ArrayList<String[]>();
		 String inForeign = new String();
		//List<String> inForeign = new ArrayList<String>();
		boolean check = false;
		
		while (sc.hasNextLine()){
			String chk = sc.nextLine();
			if (chk.equals(""))
				check=true;
		
			if (!check){
				wordFor=chk.split(" ");
				inDict.add(wordFor);
			}
			else{
				inForeign = sc.nextLine();
				String inDiction = "";
				for (String[] x : inDict){
					if (x[1].equals(inForeign))
							inDiction = x[0];
							//System.out.println(x[0]);
					
			}	
				
			if (inDiction != "")
				System.out.println(inDiction);
			else
				System.out.println("eh");
			
			}
		}
	}

}
