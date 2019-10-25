public class SortingAlgorithms {

    public static void main(String[] args) {
    }


    //Mahmoud Tarek starts Coding ==>
    public void SelectionSort(int[] arr){
      int cur_max;
      for(int i=0; i< arr.length; i++){
        cur_max = i;
        for(int j=i; j<arr.length; j++)
          cur_max = arr[j] > arr[cur_max] ? j : cur_max;
        int temp = arr[cur_max];
        cur_max = arr[j];
        arr[j] = temp;
      }
    }
    //<== DONE


    public void InsertioSort(int[] arr){
      int i,j,key;
      i=1;
      while(i<arr.length){
          key=arr[i];
          j=i-1;
          while(j>=0&&arr[j]>key){
              arr[j+1]=arr[j];
              j=j-1;
              arr[j+1]=key;}
          i++;
          }
    }
    // Mohamed Helal started here 
    public void BubbleSort(int[] list){
         
        boolean needPass = true ;
        
        for (int i = 1 ; i < list.length && needPass ; i++)
        {
            needPass = false ; 
            for (int j = 0; j < list.length - i ; j++ )
            {
                if (list[j] > list[j+1])
                {
                  int temp = list[j];
                  list[j] = list[j+1];
                  list[j+1] = temp ;
                  needPass = true ; 
   
                }
            }   
 
        }

    }


    //Mohamed Nasser MAMMA MIA MARCELLO



       public static void quickSort ( int []list){
           
           quickSort(list ,0, list.length-1);
       }
       
       public static void quickSort(int[] list , int first ,int last){
           if(last > first){
               int pivotIndex = partition(list,first,last);
               quickSort(list , first , pivotIndex - 1);
               quickSort(list , pivotIndex + 1 , last);
               
           }
           

       }
       public static int partition(int[] list , int first , int last){
            int pivot = list[first];
            int low = first + 1 ;
            int high = last ;
               
            while(high > low){
                while(low <= high && list[low] <= pivot)
                    low++;
                   
                while(low <= high && list[high] > pivot)
                    high--;
                   
                if(high > low){
                    int temp = list[high];
                    list[high] = list [low];
                    list[low] = temp;
                   }
               }
              while(high > first && list[high]>= pivot)
                  high--;
              
             if(pivot > list[high]){
                list[first]= list[high];
                list[high]= pivot;
                return high;
                  
                  }
            else
                return first ;
        } 
    }


// Yassser Started here
        public static int[] mergeSort(int[] array){
                if (array.length <= 1) {
                    return array;

                }
                int midpoint = array.length / 2;
                int[] left = new int[midpoint];
                int[] right;

                if(array.length % 2 ==0 ){
                    right = new int [midpoint];
                } else {
                    right = new int[midpoint + 1];

                }
                for (int i=0 ; i< midpoint ; i++){
                    left[i] = array[i];

                }
                for (int j=0 ; j < right.length; j++){
                    right[j] = array[midpoint+j];
                }
                int[] result = new int[array.length];
                left = mergeSort(left);
                right = mergeSort(right);

                result = merge(left, right);
                return result;
            }
            public static int[] merge(int[] left , int[] right){
                int[] result = new int [left.length + right.length];

                int leftPointer ,rightPointer , resultPointer;
                leftPointer = rightPointer = resultPointer = 0;

                while(leftPointer < left.length || rightPointer < right.length){
                    if(leftPointer < left.length && rightPointer < right.length){
                        if (left[leftPointer] < right[rightPointer]){
                            result[resultPointer++] = left[leftPointer++];
                        } else {
                            result[resultPointer++] = right[rightPointer++];

                        }             
                        }
                    else if (leftPointer < left.length){
                        result[resultPointer++] = left[leftPointer++];
                    }
                    else if (rightPointer < right.length){
                        result[resultPointer++] = right[rightPointer++];
                    }
                }
                return result;
            }