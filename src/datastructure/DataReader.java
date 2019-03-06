package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(textFile);
			System.out.println("File found");
		} catch (FileNotFoundException e) {
			System.out.println("File did not found");
		}
		Stack<String> Stack = new Stack<String>();
		List<String> List = new LinkedList<String>();
		BufferedReader br = new BufferedReader(fr);
		String a;
		ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.createTableFromStringToMySqul("Car", "Info");
		try {
			while ((a = br.readLine()) != null) {
				System.out.println(a);
				String[] word = a.split("");
				for (int i = 0; i < word.length; i++) {
					Stack.push(word[i]);
					List.add(word[i]);
				}
				connect.insertDataFromStringToSqlTable(a, "Car", "Info");
			}
    catch(Exception e){

			}
			finally{
				try{br.close();
					fr.close();
			}
				catch (IOException e1){
					e1.printStackTrace();
				}

		}
			Stack.push("Dhaka");
			Stack.pop();
			Stack.peek();
			Stack.search("Dhaka");
			//read from database;
			List<String > text =connect.readDataBase("Car","Info");
           for(String x: text){
           	System.out.println(x);
		   }
           //retrive as fifo order
			for(int  b=0;b<List.size();b++){
				System.out.println(List.get(b));
			}
			//retrive fifo integer
			Iterator<String> iterator =List.iterator();
			while (iterator.hasNext()){
				System.out.println(iterator.hasNext() +"");
			}
			//retriving using while loop
			while (!Stack.isEmpty()){
				System.out.println(Stack.pop()+"");
			}
	}
}
