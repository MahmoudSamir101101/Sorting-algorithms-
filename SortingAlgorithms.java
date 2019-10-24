public class SortingAlgorithms {

    public static void main(String[] args) {
    }

    public void SelectionSort(int[] arr){
    }

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
    public void BubbleSort(int[] arr){
    }
    //Follow the same structure when adding extra method
    }
