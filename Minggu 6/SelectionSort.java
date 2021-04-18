package selection.sort;

/**
 *
 * @author Yannn
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] dataArray = {87, 1, 34, 56, 13};
        int smallest;
        int temp;
        int n = dataArray.length;
        
        System.out.println("Before using selection sort: ");
        for (int x : dataArray){
            System.out.print(x + " ");
        }
        System.out.println();
        
        //code for selection sort
        for (int i = 0; i < n-1; i++){
            smallest = i;
            for (int j = i+1; j < n; j++){
                System.out.println("A: " + dataArray[smallest] + " > " + "B: " + dataArray[j]);
                if (dataArray[j] < dataArray[smallest]){
                    smallest = j;
                }
            }
            temp = dataArray[i];
            dataArray[i] = dataArray[smallest];
            dataArray[smallest] = temp;
            
        }
        
        System.out.println("After using selection sort: ");
        for (int x : dataArray){
            System.out.print(x + " ");
        }
    }
}
   
