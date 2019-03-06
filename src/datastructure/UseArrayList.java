package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception{
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Very");
		list.add("Hard");
		list.add("Exam");
		list.add("Going on");
		System.out.println(list);
		list.get(1);
		list.remove(2);
		System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		for (String a: list){
			System.out.println("List Name "+a);
		}
		Collections.sort(list);
		System.out.println(list);
		List al =new ArrayList();
		al=list;
		ConnectToSqlDB.connectToSqlDatabase();
		ConnectToSqlDB ar = new ConnectToSqlDB();
		ar.createTableFromStringToMySqul("Array_list","listElement");
		ar.insertDataFromArrayListToSqlTable(al,"Array_list","ALMethods");
		List<String> number = ar.readDataBase("Array_list","ALMethods");
		for (String str:number){
			System.out.println(str);
		}
	

	}

}
