/*import java.util.*;
public class EverywhereMan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases, trips;
		
		cases = sc.nextInt();
		
		Set<String> noDupes = new HashSet<String>();
		int cities[] = new int[cases];
		
		
		for (int x = 0; x <cases; x++){
			trips = sc.nextInt();
			String places[] = new String[trips];
			sc.nextLine();
			places[0]=sc.nextLine();
			for (int y = 1; y < trips; y++){
				places[y] = sc.nextLine();
			}
			
			 noDupes = new HashSet<String>(Arrays.asList(places));
			 cities[x] = noDupes.size();
		}

		for (int x = 0; x < cases; x++){
			System.out.println(cities[x]);
		}
		
		sc.close();
	}

}*/
