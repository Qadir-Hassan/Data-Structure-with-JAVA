import java.sql.Array;

public class SortArray {

    public  static  int[] sortFunction(int[] arr) {

        int[] sortedArray = arr;
        int temp = 0;
        for(int i=0;i<sortedArray.length;i++){
            for (int j=i+1;j<sortedArray.length;j++){
                if(sortedArray[i]>sortedArray[j]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;



    }
    public  static  void  main(String[] args){

        int[] unSortedArray = {1,2,4,1,7};
       int[] sorted = sortFunction(unSortedArray);

       for(int i=0;i<sorted.length;i++){
           System.out.print(sorted[i] + " ");
       }






    }
}
