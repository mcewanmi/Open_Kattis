import java.util.*;
public class ElementaryMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pairs = sc.nextInt();
		String pairsArr[] = new String[pairs];
		int pairsCheck[] = new int[pairs];
		String a = sc.next();
		pairsArr[0] = a + sc.nextLine();
		
		boolean fail = false;
		for (int x=1; x< pairs; x++){
			pairsArr[x] = sc.nextLine();
			if (x > 0){
				for (int y =0; y< x; y++){
					if (pairsArr[y].equals(pairsArr[x])){
							pairsCheck[x]++;
							if (pairsCheck[x]>3)
								fail = true;
					}
				}
			}
		}

		
		String arrConv[] = new String[2];
		String pairsArrNew[] = new String[pairs*3];
		int vals[] = new int[2];
		int allVals[] = new int[pairs*3];
		String strVals[] = new String[pairs*3];
		if (fail) System.out.println("impossible");
		else{
			for (int x=0; x<pairs; x++){
				arrConv=pairsArr[x].split(" ");
				vals[0] = Integer.parseInt(arrConv[0]);
				vals[1] = Integer.parseInt(arrConv[1]);
				int y=x*3; 
				pairsArrNew[y]=pairsArr[x];
				pairsArrNew[y+1]=pairsArr[x];
				pairsArrNew[y+2]=pairsArr[x];
				allVals[y] = (vals[0] + vals[1]);
				allVals[y+1] = (vals[0] - vals[1]);
				allVals[y+2]=(vals[0] * vals[1]);
				strVals[y]=(vals[0] + " + " + vals[1] + " = " + (vals[0]+vals[1]));
				strVals[y+1]=(vals[0] + " - " + vals[1] + " = " + (vals[0]-vals[1]));
				strVals[y+2]=(vals[0] + " * " + vals[1] + " = " + (vals[0]*vals[1]));
				
			}
			
			for (int x=0; x<allVals.length-1; x++){
				for (int y=x+1; y<allVals.length; y++){
					if (allVals[x] == allVals[y] ){
						//allVals[y]=(int) (Math.pow(10, 6)+1);
						strVals[y]="";
						pairsArrNew[y]="";
					}
					
				}
			}
			
			
			for (int x=0; x<allVals.length-1; x++){
				if (!pairsArrNew[x].equals("")){
					for (int y=x+1; y<allVals.length; y++){
						if (pairsArrNew[x].equals(pairsArrNew[y])){
							strVals[y]="";
							pairsArrNew[y]="";
						}
						else break;
					}
				}
			}
			
			
			for (int x=0; x< allVals.length; x++){
			if (!strVals[x].equals(""))
				System.out.println(strVals[x]);
			
		}
		
			
			
		}
		
		
		
		
		sc.close();
	}

}
