package rep.ddad.EmployeeIds;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

import rep.ddad.EmployeeIds.display.displayHashMap;

public class EIMain {
	public static String pas="√";
	public static int mainL=0,e=0;
	//@SuppressWarnings("unused")
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		HashMap<String,Integer> ids= new HashMap<>();
		System.out.println("Welcome to our employee management system. ");
		while(mainL==0) {
		System.out.print("What would you like to do? (Enter/Get/Display)\n");
		String inp1=input.nextLine();inp1.toLowerCase();
		e=0;
		if(inp1.toLowerCase().contains("enter")){
			while(e==0) {
			getIdEnter(ids,input);
			}
		}
		else if(inp1.toLowerCase().contains("display")){getIdGet(ids,input);}
		//
		else if(inp1.toLowerCase().contains("get")){getIdGet(ids,input);}
		//
		else {System.out.println("Type not supported");}
		}
		System.out.println("Thank you for using our Employee Management system. Goodbye!");
		System.exit(e);
	}
	public static boolean getIdEnter(HashMap<String,Integer> ids,Scanner in) {
		getEnter id=new getEnter(ids);
		id.getIdEnter();
		return false;
	}
	public static boolean getIdGet(HashMap<String,Integer> ids,Scanner in)throws NoSuchElementException{
		getId id=new getId(ids);
		try {
			id.getIds();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean arDis(HashMap<String,Integer> ids, Scanner in)
	{
		displayHashMap a=new displayHashMap(ids);
		try {
			a.displayMap();
		} catch (InterruptedException ioe) {
			ioe.printStackTrace();
		}
		return false;
	}
}