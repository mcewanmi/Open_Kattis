import java.util.Scanner;
public class P2048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[][] board = new int[4][4];
		
		for (int y=0; y<4; y++){
		for (int x=0; x<4; x++)
		board[y][x]=sc.nextInt();
		sc.nextLine();
		}
		
		int dir = Integer.parseInt(sc.nextLine());
		
		
		
		
		for (int y=0; y<4; y++){
			for (int x=0; x<4; x++){
				if (dir == 0){
					if (board[y][x] != 0){
						
					}
				
				
				
				}
				
			
			}
		}
		
		
		
		
		
		
		
	}

}
