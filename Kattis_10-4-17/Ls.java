import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String regex = sc.nextLine();
		while (regex.contains("[\\W+]"))
			regex=regex.replace("[\\W+]", "*\\"+regex.charAt(regex.indexOf("[\\W+]")));
	
		System.out.println(regex);
		int ins = Integer.parseInt(sc.nextLine());
		List<String> arr = new ArrayList<String>(); 
		
		for (int x=0; x<ins; x++){
			String in = sc.nextLine();
			if (in.matches(regex))
				arr.add(in);
			}
	
		for (String x : arr)
			System.out.println(x);
	}

}
