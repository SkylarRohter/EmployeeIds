package rep.ddad.EmployeeIds;
import java.util.HashMap;
import java.util.Scanner;

public class getEnter extends EIMain{
	public String name;
	public HashMap<String, Integer> id;
	public getEnter(HashMap<String,Integer> ids) {
		this.id=ids;
	}
	public void getIdEnter() {
	Scanner in=new Scanner(System.in);
		System.out.println("Please enter a employee name, followed by their id [name,id]");
		String be=in.nextLine();
		if(be.toLowerCase().contains("quit")||be.toLowerCase().contains("leave")){EIMain.e=1;}
		else {
		String name=be.substring(0,be.indexOf(','));
		String numbe=be.substring(be.indexOf(',')+1,be.length());
		try {
		int num=Integer.parseInt(numbe);
		id.put(name.toLowerCase(), num);
		System.out.println(id);
		}
		catch(NumberFormatException nfe) {
		System.out.println("Invalid Id. Please only use numbers. ");
		in.close();
		}
		}
	}
}
