import java.util.ArrayList;
import java.util.Scanner;
public class Batmanacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long nth = sc.nextLong();
		//long kLen = sc.nextLong();
		//sc.hasNext();
		sc.nextLine();
		sc.close();
	
		ArrayList<Integer> na = new ArrayList<Integer>();
		na.add(1);
		na.add(1);
		for (long x=0; x< nth; x++){
			na.add((na.get(0)+na.get(1))%2);
			na.remove(0);
		//	System.out.println(na);
		}
		if (na.get(na.size()-1)==0)
			System.out.println("N");
		else
			System.out.println("A");
		//System.out.println(na.get(na.size()-1));
		
		/*
		ArrayList<StringBuilder> na = new ArrayList<StringBuilder>();
		na.add(new StringBuilder("N"));
		na.add(new StringBuilder("A"));
		
		int x=0;
		while (x <= nth){//for (int x=2; x<nth; x++){
			if (na.get(1).length() > kLen){
				na.set(1, new StringBuilder(na.get(1).substring(0, kLen+1)));
				//System.out.println(na.get(1));
			}
			na.add(na.get(0).append(na.get(1)));
			na.remove(0);
			System.out.println(na);
		x++;
		}
		
		
		System.out.println(na.get(1).charAt(kLen-1));
		*/
	}

}
