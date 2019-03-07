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

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";//.txt";
		System.out.println(textFile);
		Stack<String> stack = new Stack<String>();

		LinkedList<String> list = new LinkedList<String>();

		BufferedReader br = null;

		String fileText = null;

		try {

			FileReader fr = new FileReader(textFile);

			br = new BufferedReader(fr);

		}catch (FileNotFoundException e) {

			System.out.println(e);

		}

		try {

			if (br.ready())

				fileText = br.readLine();

		}catch (IOException e) {

			System.out.println(e);

		}

		catch (NullPointerException e)

		{

			System.out.println(e);

		}

		String [] words = fileText.split(" ");

		for(int i=0;i<words.length;i++) {

			System.out.println(words[i]);

			stack.push(words[i]);

			list.add(words[i]);

		}

		System.out.println("Stack Peek:  "+  stack.peek());

		System.out.println("Stack Pop:  "+  stack.pop());

		System.out.println("Stack Search:  "+stack.search("Google"));



		Iterator it = list.iterator();

		System.out.println("Linked List Display:");

		while (it.hasNext())

			System.out.println(it.next());


	}
}
