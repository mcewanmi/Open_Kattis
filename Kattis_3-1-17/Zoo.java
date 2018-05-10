/*
import java.util.*;

public class Zoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int cases = sc.nextInt();
		//sc.nextLine();
		int a=0;
		int n=1;
		while (n > 0){
			n = sc.nextInt();
			if (n != 0){
				a++;
				System.out.println("List " + a + ":");
				String animals[] = new String[n];
				sc.nextLine();
				for (int x=0; x<n; x++){
					animals[x] = sc.nextLine();
					if (animals[x].contains(" "))
					animals[x] = animals[x].substring(animals[x].lastIndexOf(' ')+1);
					animals[x]=animals[x].toLowerCase();			
				
				}
				int animCount[] = new int[n];
				int count = 0;
				for (int x=0; x<n; x++){
					if (!animals[x].equals("")){
							animCount[x]=1;
							count++;
					for (int y=x+1; y<n; y++){
						
							if(animals[x].equals(animals[y])){
								animCount[x]++;
								animals[y] = "";
								
							}
						}
					}
					
				}
				
				int temp = 0;
			String anims[] = new String[count];
			int animsC[] = new int[count];
			for (int x=0; x<n; x++){
				if (animals[x].length() > 0){
					anims[temp] = animals[x];
					animsC[temp]=animCount[x];
					temp++;
				}
			}
			for (int x=0; x<temp; x++){
					for (int y=x+1; y<temp; y++){
					
							if (anims[x].compareTo(anims[y]) >0){
								String tempS = anims[x];
								anims[x] = anims[y];
								anims[y] = tempS;
								int tempC = animsC[x];
								animsC[x] = animsC[y];
								animsC[y] = tempC;
							
							}
						//}
					
					}
					
			}
				for (int x=0; x<temp; x++)
					System.out.println(anims[x] + " | " + animsC[x]);
				
				
			}
			
		}
		sc.close();

	}

}*/
