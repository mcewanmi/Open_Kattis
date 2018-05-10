import java.util.Scanner;
public class TouchscreenKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for (int x=0; x<cases; x++){
			char[] word = sc.next().toCharArray();
			int numEs = sc.nextInt();
			//char[] entries = new char[numEs];
			
			String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"}; 
			
			String[] outEnt = new String[numEs+1];
			int[] outInt = new int[numEs+1];
			
			for (int y=0; y<=numEs; y++){
				
				char[] entry=sc.nextLine().toCharArray();
				int dist=0;
				
				for (int z=0; z<entry.length; z++){ //for each letter per 'word'
					int num1=0, num2=0, num3=0;
					
					for (int a=0; a<keyboard.length; a++) //find the line on the keyboard for Word[letter]
						if (keyboard[a].contains(String.valueOf(word[z]))){
							num1=keyboard[a].indexOf(z);
							num3=a;
							break;
						}
					for (int a=0; a<keyboard.length; a++) //find the line on the keyboard for Entry[letter]
						if (keyboard[a].contains(String.valueOf(entry[z]))){
							num2=keyboard[a].indexOf(z);
							dist+=Math.abs(num2-num1)+Math.abs(a-num3); //add the horizontal, then vertical distance
							break;
						}
					
					
				}
				outEnt[y] = String.valueOf(entry);
				outInt[y] = dist;
				
			}
			
			int tempI;
			String tempS;
			for (int a=0; a<numEs*numEs; a++){
			for (int y = 0; y < numEs-1; y++){
				if (outInt[y] > outInt[y+1] || (outInt[y] == outInt[y+1] &&  outEnt[y].compareTo(outEnt[y]) == 1)){
					tempI = outInt[y];
					outInt[y] = outInt[y+1];
					outInt[y+1] = tempI;
					
					tempS = outEnt[y];
					outEnt[y] = outEnt[y+1];
					outEnt[y+1] = tempS;
					}
				}
			}
			
			
			for (int y=0; y<numEs; y++){
				System.out.println(outEnt[y] + " " + outInt[y]);
			}
		}
		

	}
}
