import java.util.ArrayList;
import java.util.Scanner;

public class GameOfThrowns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stud = sc.nextInt();
		sc.nextLine();
		
		int thrown=0;
		ArrayList<String> input = new ArrayList<String>();
		boolean undo = false;
		String[] in0 = sc.nextLine().split(" ");
		for (String in : in0){

			if (in.equals("undo"))
					undo = true;
			else
				if (!undo){
					if (Integer.parseInt(in) % stud == 0)
						in="0";
					input.add(in);
				}
				
			
			if (undo && !in.contains("undo")){
				for (int y=0; y<Integer.parseInt(in); y++){
					input.remove(input.size()-1);
				}
				
			undo = false;
			}
		}
		//System.out.println(input);
		for (int x=0; x<input.size(); x++)
			if (thrown + Integer.parseInt(input.get(x)) < 0){
				int temp = Math.abs(thrown+Integer.parseInt(input.get(x)))%stud;
				thrown = stud-temp;
			}else
				thrown=(thrown+Integer.parseInt(input.get(x)))%stud;
		
		System.out.println(thrown);
		
		sc.close();
	}
}
