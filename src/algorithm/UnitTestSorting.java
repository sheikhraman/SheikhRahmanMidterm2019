package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertion sort
        try{
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not sorted");
        }
        catch (Exception e){
            e.getMessage();
        }
        //bubbble sort
        sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertion sort algorithm
        try{
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not sorted");
        }
        catch (Exception es){
            es.getMessage();
        }
        //merger sort
        sort.mergeSort(unSortedArray);
        //verify if the unsorted array is sortd by the merage sort algorithm
        try{
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not sorted");
        }
        catch (Exception ex){
            ex.getMessage();
        }
        //heap sort
        sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heap sort algortitim
        try{
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not found");
        }
        catch (Exception e){
            e.getMessage();
        }
        //quick sort
        sort.quickSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not sorted");
        }
        catch (Exception ep){
            ep.getMessage();
        }
        //shell sort
        sort.shellSort(unSortedArray);
        //verify if the unsorted arry is sorted by the shell sort algorithm
        try{
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not sorted");
        }
        catch (Exception ex){
            ex.getMessage();
        }
        //bucket short
        sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the bucked sort algorithm
        try{
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not sorted ");
        }
        catch (Exception en){
            en.getMessage();
        }



    }
}
