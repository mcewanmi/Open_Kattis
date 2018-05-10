import java.util.Scanner;
public class YingYang {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		
		int x=0, wNum =0, bNum=0, changeCtr=0;
		boolean end=false;
		String change = new String();
		
		//System.out.println(s + " A " + x+ " " + bNum + " " + wNum);
		while (s.length()>2 && !end){
			change=s;
			if (bNum > 0 && bNum < wNum && Math.abs(wNum - bNum) == 1){
				//System.out.println("Before W " + s);
				if (x-(bNum+wNum-1) <0){
					//System.out.println(s + " A " + x+ " " + bNum + " " + wNum);	

					s=s.substring(x+1,s.length()-Math.abs(x-(bNum+wNum-1)))+"W";
				}
				else{
					//System.out.println(s + " B " + x+ " " + bNum + " " + wNum);	
					s=s.substring(0, x-(bNum+wNum))+"W"+s.substring(x, s.length());

				}
				//System.out.println(s + " " + x+ " " + bNum + " " + wNum);
				//System.out.println("After " + s);
				x=0;
				wNum=0;
				bNum=0;
			}
			else if (wNum > 0  && wNum < bNum && Math.abs(bNum - wNum) == 1){
				//System.out.println("Before B " + s);
				if (x-(bNum+wNum-1) <0){
					s=s.substring(x+1,s.length()-Math.abs(x-(bNum+wNum-1)))+"B";
					//System.out.println(s + " A " + x+ " " + bNum + " " + wNum);	
				}
				else{
					//System.out.println(s + " B " + x+ " " + bNum + " " + wNum);	
					s=s.substring(0, x-(bNum+wNum))+"B"+s.substring(x, s.length());
					//System.out.println(s + " " + x+ " " + bNum + " " + wNum);	
				}
			//System.out.println("After " + s);
			wNum=0;
			bNum=0;
			x=0;
			}

			if (s.charAt(x)=='W'){
				wNum++;
				
			}
			else if (s.charAt(x)=='B'){
				bNum++;
				
			}
			
			if (x<s.length()-1)x++;
			else
			{
				x=0;
				if (change.equals(s)) changeCtr++;
				if (changeCtr==2)
					end=true;
			}
		}
		
			
		if (s.equals("WB") || s.equals("BW"))
			System.out.println(1);
		else
			System.out.println(0);
				
		//System.out.println(s);
			
		sc.close();	
	}
}
