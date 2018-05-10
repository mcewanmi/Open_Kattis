import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class OpenSource {

	public static  List<String> getCommonElements(Collection<String> names) {

	    Set<String> common = new LinkedHashSet<String>();
	    if (!names.isEmpty()) {
	       Iterator<String> iterator = names.iterator();
	       common.addAll((Collection<String>) Collections.singletonList(iterator.next()));
	       while (iterator.hasNext()) {
	          common.retainAll(Collections.singleton(iterator.next()));
	       }
	    }
	    List<String> common2 = new ArrayList<String>(common);
	    return common2;
	}
	
	static class Test{
		String title = new String();
		List<String> names = new ArrayList<String>();
		int count = 0;
		
		public String toString(){
			return (title + " " + count); 
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test project = new Test();
		List<Test> projects = new ArrayList<Test>();
		String name = sc.nextLine();
		
		while (!name.equals("0")){
			if (name.matches("[A-Z *]+")){
				if (!project.title.equals("")){
					projects.add(project);
					project = new Test();
				}
				project.title = name;
				
			}
			else if (name.matches("[a-z]+[a-z0-9]*")){
				project.names.add(name);
				project.count++;
			}
			else if (name.equals("1")){
		
				projects.add(project);
			
				
				for (int x=0; x< projects.size(); x++){
				
						System.out.println("1 "+ projects.get(x).names + " " + projects.get(x).count);
						Set<String> nameSet = new HashSet<String>(projects.get(x).names);
						projects.get(x).names = new ArrayList<String>(nameSet);
						projects.get(x).count = projects.get(x).names.size();
						System.out.println("2 "+ projects.get(x).names + " " + projects.get(x).count);
				}
						
				
				//		for (int x=y; x< projects.size(); x++){	
							//System.out.println(intersection);
							
					//	}
					//	if (y==projects.size()-2)
					//	System.out.println(intersection);
			//	}/

				
				
					List<String> intersection = new ArrayList<String>();
					for (int x=0; x<projects.size(); x++)
						intersection = getCommonElements(projects.get(x).names);
					System.out.println(intersection);
					/*for (int x=0; x< projects.size()-1; x++){
						intersection = new ArrayList<String>(projects.get(x).names);
						for (int y=0; y< projects.size()-1; y++){
							intersection.retainAll(projects.get(y).names);
						}
							//System.out.println(intersection);
							projects.get(x).names.removeAll(intersection);
							projects.get(x+1).names.removeAll(intersection);
							projects.get(x).count=projects.get(x).names.size();
							projects.get(x+1).count=projects.get(x+1).names.size();
							//System.out.println(projects.get(x+1).names);
					
						}*/
		//	}
				
				for (int y=0; y<projects.size(); y++){
					for (int x=0; x< projects.size()-1; x++){
						if (projects.get(x).count < projects.get(x+1).count){
							Test temp = projects.get(x);
							projects.set(x, projects.get(x+1));
							projects.set(x+1, temp);
						}
						else if (projects.get(x).count == projects.get(x+1).count){
							if (projects.get(x).title.compareTo(projects.get(x+1).title) > 0){
									Test temp = projects.get(x);
									projects.set(x, projects.get(x+1));
									projects.set(x+1, temp);
							}		
						}
					}
				}
				for (Test x : projects)
					System.out.println(x.toString());
				
				project = new Test();
				projects = new ArrayList<Test>();
				
		
			}
			
			name=sc.nextLine();
		}
		sc.close();
	}
}

