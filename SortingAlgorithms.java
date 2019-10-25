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
