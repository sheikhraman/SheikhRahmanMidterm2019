package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args)throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityOfUS = new ArrayList<>();
		cityOfUS.add("New York");
		cityOfUS.add("New Jersy");
		cityOfUS.add("Connecticut");
		cityOfUS.add("Washington D.C");
		cityOfUS.add("Main");
        List<String> cityOfBd = new ArrayList<>();
        cityOfBd.add("Faridpur");
        cityOfBd.add("Gopalgonj");
        cityOfBd.add("Khulna");
        cityOfBd.add("Jessore");
        cityOfBd.add("Rajbari");
        List<String> cityOfUk = new ArrayList<>();
        cityOfUk.add("London");
        cityOfUk.add("Bristol");
        cityOfUk.add("Liverpool");
        cityOfUk.add("Manchaster");
        cityOfUk.add("Scotland");
		Map<String,List<String>> lst=new HashMap<String ,List<String>>();
		lst.put("United States: ", cityOfUS);
		lst.put("Bangladesh",cityOfBd);
		lst.put("United Kingdom: ",cityOfUk);
		System.out.println(lst);
		for (Map.Entry<String,List<String>> st: lst.entrySet()){
			System.out.println(st.getKey() +"--------"+st.getValue());
		}
		System.out.println(" ");
		Set sts = lst.entrySet();
		Iterator its = sts.iterator();
		while (its.hasNext()){
			System.out.println(its.next());
		}
		ConnectToSqlDB cons = new ConnectToSqlDB();
		List lsts = cityOfUS;
		cons.insertDataFromStringToSqlTable(String.valueOf(lsts),"cityOfUS","City");
		System.out.println("Data Showing from database");
		List<String> umberss = cons.readDataBase("cityOfBd","City");
		for(String st: umberss){
			System.out.println(st);
		}
		List lst1  = cityOfBd;
		cons.insertDataFromStringToSqlTable(String.valueOf(lst1),"cityOfBd","City");
		System.out.println("Data shows from database");
		List<String > numbera = cons.readDataBase("cityOfBd","City");
		for(String strng : numbera){
			System.out.println(strng);
		}
		List lst2 = cityOfUk;
		cons.createTableFromStringToMySqul(String.valueOf(lst2),"cityOfUk","City");
		System.out.println("Data shows");
		List<String> lst12 = cons.readDataBase("cityOfUk","City");
		for(String st: lst12){
			System.out.println(st);
		}
	}

}
