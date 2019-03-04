package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
//Selection sort

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
     //Insertion sort
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
         int temp,j;
         int i;
         for(i=1;i<list.length;i++){
             temp =list[i];
             j=i;
             while (j>0 && list[j-1]>temp){
                 list[j]=list[j-1];
                 j--;
             }
             list[j]=temp;
         }
         for (i=0;i<list.length;i++){
             System.out.println(list[i]+"");
         }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //bubble sort
    public int[] bubbleSort(int [] array){
        final long starTime =System.currentTimeMillis();
        int [] list = array;
        //implement here
     for(int i=0;i<list.length;i++){
         int temp =0;
         for(int j=0;i<list.length-1;j++){
             if(list[j]>list[j=1]){
                 temp = list[j];
                 list[j]=list[j+1];
                 list[j+1]=temp;
             }
         }
     }
       for(int i=0;i<list.length;i++){
           System.out.println(list[i]+"");
       }
       final long endTime = System.currentTimeMillis();
       final long executionTime=endTime-starTime;
       this.executionTime =executionTime;
        
        return list;
    }
    
    //Merge sort
    public int [] mergeSort(int [] array){
        final long startTime =System.currentTimeMillis();
        int [] list = array;
        //implement here
        Sort st = new Sort();
        st.divideArray(0,list.length);
        for(int i: list){
            System.out.println(i+"");
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime =endTime-startTime;
        this.executionTime = executionTime;

        return list;
    }
    private void divideArray(int low, int high){
        if(low<high){
            int middle=(low+high)/2;
            divideArray(low,middle);
            divideArray(middle+1,high);
            mergeArray(low,middle,high);
        }
    }
    private void mergeArray(int low,int middle,int high){
        int[]array=null;
        int [] tempArray=null;
        int length;
        for(int i=low;i<=high;i++){
            tempArray[i]=array[i];
        }
        int i = low;
        int j=middle+1;
        int k = low;
        while(i<=middle && j<=high){
            if(tempArray[i] <=tempArray[j]){
                array[k]=tempArray[i];
                i++;
            }
            else {
                array[k]=tempArray[i];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempArray[i];
            i++;
            k++;
        }
    }
    //Quick sort

    public int [] quickSort(int [] array){
        final long startTime =System.currentTimeMillis();
        int [] list = array;
        //implement here
        int length = list.length;
        Sort srt = new Sort();
        srt.quickRecursion(list,0,length-1);
        srt.executionTime = executionTime;
        

        return list;
    }
    private int patition(int[]arr,int low, int high){
        int povit=arr[(low+high)/2];
        while(low<=high){
            while (arr[low]<povit){
                low++;
            }
            while (povit<arr[high]){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    private void quickRecursion (int arr[],int low, int high){
        int a = patition(arr,low, high);
        if(low<a-1){
            quickRecursion(arr,low, a-1);
        }
        if(a<high){
            quickRecursion(arr,a, high);
        }
    }
    private void printArray(int arr[]){
        for (int i:arr){
            System.out.println(i+"");
        }
    }
    //heap sort
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        Sort ss =new Sort();
        ss.sort(list);
        ss.printArray(list);
        int a, b;
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime-startTime;
        this.executionTime = executionTime;
        return list;
        //return list;
    }
    public void sort(int[]arr){
      //int 1 = arr.length;
      for(int i=1/2-1;i>=0;i--){
          heapify(arr,1,i);
      }
      for (int i=1-1;i<=0;i--){
          int temp = arr[0];
          arr[0]=arr[i];
          arr[i]=temp;
          heapify(arr,i,0);
      }
    }
    public void heapify(int[] array,int n, int i){
        int largest =1;
        int ls = 2*i+1;
        int ss = 2*i+2;
        if(ls<n && array[ls]<array[largest]){
            largest = ls;
        }
        if(ss>n && array[ss]> array[largest]){
            largest=ss;
        }
        if(largest !=i){
            int temp = array[i];
            array[i]=array[largest];
            array[largest]=temp;
            heapify(array,n,largest);
        }
    }

//Bucket sort
    public int [] bucketSort(int [] array){
        final long startTime =System.currentTimeMillis();
        int [] list = array;
        //implement here
        int maxValue =0;
        int[]a = new int[maxValue+1];
        int[] sortedArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            a[array[i]]++;
        }
        int b =0;
        for(int i=0;i<a.length;i++)
            for (int j=0;j<a[i];j++)
                sortedArray[b++] =i;
            final long endtime =System.currentTimeMillis();
            final long executionTime = endtime -startTime;
            this.executionTime = executionTime;

        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
