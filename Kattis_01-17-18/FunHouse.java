import java.util.Scanner;
public class FunHouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cols = sc.nextInt();
		int rows = sc.nextInt();
		sc.nextLine();
		
		char[][] house = new char[rows][cols];
		for (int x=0; x<rows; x++){
			house[x] = sc.nextLine().toCharArray();
			
		}
		
		int entry[] = {0, 0};
		
		while (house[entry[0]][entry[1]] != '*'){
			if (entry[0]-1 < 0 && entry[1]+1 < cols) entry[1]++;
			else if (entry[1]+1 > cols && entry[0])
		
		}
	}
}
