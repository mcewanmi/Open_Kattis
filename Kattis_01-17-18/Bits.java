import java.util.Scanner;
public class Bits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = Integer.parseInt(sc.nextLine());
		for (int x = 0; x < cases; x++){
			int in = Integer.parseInt(sc.nextLine());
			int len = String.valueOf(in).length();
			int num1s=0;
			for (int y = len; y > -1; y--){
				int val = (int)(in / (Math.pow(10, y)));
				String bin = Integer.toBinaryString(val);
				int temp = bin.length() - bin.replace("1", "").length();
				if (temp > num1s)
					num1s = temp;
			}
			System.out.println(num1s);
		}

	}

}
