import java.util.Scanner;
import java.util.TreeMap;
public class Kornislav {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		TreeMap<Integer, Integer> in =new TreeMap<Integer, Integer>();
		
		for (int x=0; x<4; x++){
			int temp = Integer.parseInt(input[x]);
		if (in.containsKey(temp))
			in.put(temp, in.get(temp)+1);
		else
			in.put(temp, 1);
		}
		
		Integer vL=0, vS=0;

		if (in.get(in.lastKey()) > 1){
			vL = in.lastKey();
		}
		else{
			vL =(Integer) in.keySet().toArray()[in.size()-2];
		}
		
			vS = in.firstKey();
	
		System.out.println(vL*vS);
		/*	int in[] = new int[4];

		for (int x=0; x<4; x++)
			in[x]=Integer.parseInt(input[x]);
		
		for (int y=0; y<6; y++){ //nlogn sort
			for (int x=0; x<3; x++){
				if (in[x] > in[x+1]){
					int temp = in[x];
					in[x] = in[x+1];
					in[x+1] = temp;
				}
			}
		}
		
		System.out.println(in[2]*in[0]); */
		sc.close();
	}
}
