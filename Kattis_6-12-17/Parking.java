import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int stores=0;
		int low=100, high=-1;
		int dist[] = new int[n];
		
		for (int x=0; x<n; x++){
			stores=sc.nextInt();
			int pos[] = new int[stores];
			
			
			for (int y=0; y<stores; y++){
				pos[y]=sc.nextInt();
				if (pos[y] < low) low = pos[y];
				if (pos[y] > high) high = pos[y];
				
			}
			dist[x] = (high-low)*2;
			high = -1; low = 100;
		}
		for (int x=0; x<n; x++){
			System.out.println(dist[x]);
		}
		
	}

}
