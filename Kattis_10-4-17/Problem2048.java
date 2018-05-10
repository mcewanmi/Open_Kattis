import java.util.Scanner;
public class Problem2048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[4][4];
		
		for (int y=0; y<4; y++){
		for (int x=0; x<4; x++)
		board[y][x]=sc.nextInt();
		sc.nextLine();
		}
		
		int dir = Integer.parseInt(sc.nextLine());
		boolean zero = false;
		
		if (dir==0){
			for (int y=0; y<4; y++){
				for (int x=0; x<3; x++){
					if (board[y][x] !=0){
						for (int z=x+1;z<4; z++){
							if (board[y][z-1] == 0)
								zero=true;
							if (board[y][x] == board[y][z] && (zero || z==x+1)){ //val *2
								board[y][x]*=2;
								board[y][z] = 0;
								zero=false;
								break;
							}
						}
					}
					
					
				}
			}
			for (int y=0; y<4; y++){
				for (int x=0; x<3; x++){
					if (board[y][x] == 0){
						for (int z=x+1;z<4; z++){
							if (board[y][z] != 0){
								board[y][x] = board[y][z];
							board[y][z] =0;
							break;
							}
						}
					}
				}
			}
		}
		else if (dir==1){
			for (int y=3; y>0; y--){
				for (int x=0; x<4; x++){
					if (board[y][x] !=0){
						for (int z=y-1;z>-1; z--){
							if (board[z+1][x] == 0)
								zero=true;
							if (board[y][x] == board[z][x] && (zero || z==y-1)){ //val *2
								board[z][x]*=2;
								board[y][x] = 0;
								
								zero=false;
								break;
							}
						}
					}
					
					
				}
			}
			
		
			
			for (int y=0; y<4; y++){
				for (int x=0; x<4; x++){
					if (board[y][x] == 0){
						for (int z=y+1;z<4; z++){
							if (board[z][x] != 0){
								board[y][x] = board[z][x];
								board[z][x] =0;
								break;
							}
						}
					}
				}
			}
		}
		else if (dir==2){
			for (int y=0; y<4; y++){
				for (int x=3; x>0; x--){
					if (board[y][x] !=0){
						for (int z=x-1;z>-1; z--){
							if (board[y][z+1] == 0)
								zero=true;
							if (board[y][x] == board[y][z] && (zero || z==x-1)){ //val *2
								board[y][x]*=2;
								board[y][z] = 0;
								
								zero=false;
								break;
							}
						}
					}
					
					
				}
			}
			
			for (int y=0; y<4; y++){
				for (int x=3; x>0; x--){
					if (board[y][x] == 0){
						for (int z=x-1;z>-1; z--){
							if (board[y][z] != 0){
								board[y][x] = board[y][z];
								board[y][z] =0;
								break;
							}
						}
					}
				}
			}
		}
		else if (dir==3){
			for (int y=3; y>-1; y--){
				for (int x=0; x<4; x++){
					if (board[y][x] !=0){
						for (int z=y+1;z<4; z++){
							if (board[z-1][x] == 0)
								zero=true;
							if (board[y][x] == board[z][x] && (zero || z==y+1)){ //val *2
								board[z][x]*=2;
								board[y][x] = 0;
								
								zero=false;
								break;
							}
						}
					}
					
					
				}
			}
		
			for (int y=3; y>0; y--){
				for (int x=0; x<4; x++){
					if (board[y][x] == 0){
						for (int z=y-1;z>-1; z--){
							if (board[z][x] != 0){
								board[y][x] = board[z][x];
								board[z][x] =0;
								break;
							}
						}
					}
				}
			}
		}
		
		for (int y=0 ; y<4; y++){
			for (int x=0; x<4; x++)
				System.out.print(board[y][x] + " ");
			System.out.println();
		}
	}

}
