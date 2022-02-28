package rep.ddad.EmployeeIds;
import java.util.HashMap;
import java.util.Scanner;


public class getId {
public HashMap<String,Integer> ids;
	public getId(HashMap<String,Integer> id1) {
		this.ids=id1;
	}
	public void getIds(){
		Scanner inp=new Scanner(System.in);
		int p=0;
		while(p==0) {
		System.out.println("Would you like to search by name or id? ");
		String f=inp.nextLine();
		if(f.toLowerCase().contains("name")){
			System.out.println("Please enter a name: ");
			String name=inp.nextLine().toLowerCase();
			System.out.println("Id of "+name+" "+ids.get(name));
		}
		else if(f.toLowerCase().contains("id")){

			System.out.println("Please enter an id");
			int test=inp.nextInt();
			System.out.println("Name of "+test+" "+ids.get(test));
		}
		}
		inp.close();
	}
}
