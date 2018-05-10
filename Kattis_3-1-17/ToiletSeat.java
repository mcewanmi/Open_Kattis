/*import java.util.*;


	

public class ToiletSeat {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String seat = sc.nextLine();
		int adjustUp =0, adjustDown =0, adjustPref=0;
		boolean temp=false;
		
		//leave up
		if (seat.charAt(0) == 'D'){
			temp = true;
			adjustUp++;
			}
			
		for (int x=1; x<seat.length(); x++){
		
			if ((x >1 || !temp) && seat.charAt(x) == 'D'){ 
				adjustUp+=2;
				temp = false;
			}
		}
		
		temp=false;
		
		//leave down
		if (seat.charAt(0) == 'U'){
				adjustDown++;
				temp = true;
			}
		for (int x=1; x<seat.length(); x++){
		
			if ((x >1 || !temp) && seat.charAt(x) == 'U'){ 
				adjustDown+=2;
				temp = false;
			}
		}
		
		
		//leave by preference
		for (int x=1; x<seat.length(); x++){
			if (seat.charAt(x) == 'U' && seat.charAt(x-1) == 'D')
				adjustPref++;
			else if (seat.charAt(x) == 'D' && seat.charAt(x-1) == 'U')
				adjustPref++;
			
		}
		
		
		
		
		System.out.println(adjustUp);
		System.out.println(adjustDown);
		System.out.println(adjustPref);
		
		
		
		
		
		sc.close();
	}

}
*/