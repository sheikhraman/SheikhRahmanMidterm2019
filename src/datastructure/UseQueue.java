package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> grade = new LinkedList<String>();
		grade.add("A");
		grade.add("B");
		grade.add("C");
		grade.add("D");
		grade.size();
		grade.remove();
		grade.peek();
		grade.poll();
		Iterator ite =grade.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		for(String ste : grade){
			System.out.println("Remove Name: "+grade.remove()+"peek name: "+grade.peek()+"Poll name :"+grade.poll());
		}

	}

}
