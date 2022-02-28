package rep.ddad.EmployeeIds.display;

import java.util.HashMap;
import java.util.Scanner;

import rep.ddad.EmployeeIds.EIMain;

public class displayHashMap extends EIMain{
private HashMap<String,Integer> ids;
	public displayHashMap(HashMap<String,Integer> ids1) {
		this.ids=ids1;
	}
	public void displayMap() throws InterruptedException {
		int tries=0,p=0;
		
		Scanner inp=new Scanner(System.in);
		while(p==0) {
		System.out.println("Please enter the system password. ");
		String pe=inp.nextLine();
		if(pe.equals(pas)) {
			for(int i=0;i<ids.size();i++)
			{
				System.out.print(ids.get(i));
			}
		}
		else if(!pe.equals(pas)) {
			System.out.println("Incorrect password, please try again. ");
			tries++;
			if(tries<=5)	{
			}
			else if(tries>5)
			{
				System.out.println("Too many failed attempts, please wait 180s. ");
				System.out.println("SystemTimeout");
				Thread.sleep(180000);
				
			}
		}
		else {System.out.println("Error in password handling");}
		}
		inp.close();
	}

}
