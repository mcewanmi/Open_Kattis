/*import java.util.*;
public class AnotherBrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int numBricks = sc.nextInt();
		
		int bricks[] = new int[numBricks];
		boolean fail = false;
		
		for (int x=0; x<numBricks; x++){
			bricks[x]= sc.nextInt();
		
		}
		
		int x=0;
		int sumBricks = 0;
		
		for (int y=0; y<height; y++){
			while (sumBricks < width){
				sumBricks+=bricks[x];
				if (sumBricks > width){
				fail = true;
				break;
				}
				x++;
			}
			if (fail)break;
			sumBricks=0;
		}
		
		
		System.out.println(fail ? "NO" : "YES");
		
		sc.close();
	}

}
*/