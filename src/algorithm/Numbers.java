package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"insertion_sort","SortingNumbers");
		List<String> number1 = connectToSqlDB.readDataBase("insertion_sort","SortingNumbers");
		//By following above, Continue for rest of the Sorting Algorithm....
		//Bubble sort.
		algo.bubbleSort(num);
		long bubbleSortExceptionTime=algo.executionTime;
		System.out.println("Total execution time of" + num.length+"numbers in bubble sort"+ bubbleSortExceptionTime+"Mill sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"bubble_sort","SortingNumbers");
		List<String> number2 =connectToSqlDB.readDataBase("bubble_sort","SortingNumbers");
		//Merge Sort
		algo.mergeSort(num);
		long mergeSortExcutionTime = algo.executionTime;
		System.out.println("total execution time : "+num.length+ "Number in the merge sort take: "+mergeSortExcutionTime+"mill sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"merge_sort","SortingNumbers");
		List<String> number3 = connectToSqlDB.readDataBase("merge_sort","SortingNumbers");
		//bucket sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("total execution tie of :"+num.length+"numbers in bucket Sort take:"+bubbleSortExceptionTime+"mill sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"bucket_sort","SortingNumbers");
		List<String> number4 = connectToSqlDB.readDataBase("bucket_sort","SortingNumbers");
		//Heap sort
		algo.heapSort(num);
		long heapSortExecutionTime=algo.executionTime;
		System.out.println("Total execution time: "+num.length+"number in heap sort take : "+heapSortExecutionTime+"mill sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"heap_sort","SortingNumbers");
		List<String> number5 = connectToSqlDB.readDataBase("heap_sort","SortingNumbers");
		//Quick Sort
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total execution time of :"+num.length+"Numbers in quicksort take: "+quickSortExecutionTime+"mill sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"quick_sort","SortingNumbers");
		List<String> number6= connectToSqlDB.readDataBase("quick_sort","SortingNumbers");
		//shell sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("total execution time of :"+num.length+"numbers in shell sort: "+shellSortExecutionTime+"mill sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num,"shell_sort","SortingNumbers");
		List<String> number7 = connectToSqlDB.readDataBase("shell_sort","SortingNumbers");
		//Come to conclusion about which Sorting Algo is better in given data set.
		System.out.println("Quick sort and merge sort are better sorting opto for this particular data");

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
