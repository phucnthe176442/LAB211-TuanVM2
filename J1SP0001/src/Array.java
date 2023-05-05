package J1SP0001.src;
import java.util.Random;
/**
 *
 * @author phucnthe176442
 */
public class Array {
    private static Random rand = new Random();
    
    public static int[] randIntArr(int num) {
        int[] arr = new int[num];
        // reach each element
        for(int i = 0; i < num; ++i) 
            arr[i] = randInt(1, num);
        
        return arr;
    }
    
    private static int randInt(int l, int r) {
        return rand.nextInt(r-l+1) + l;
    }
    
    public static void sortArr(int[] arr, boolean test) {
        int num = arr.length;
        
        /* loops from last index to 2nd index,
        after each loop this right bound of unsorted decrease by 1 */
        for(int i = num-1; i > 0; --i)
            /* loops from first to last index of left element of 
            adjacent pair in unsorted range */
            for(int j = 0; j < i; ++j)
                // check unorder pair
                if(arr[j] > arr[j+1]) {
                    // testing
                    if(test == true) {
                        displayArr("\n", arr);
                        System.out.print(" | "+arr[j]+" > "+arr[j+1]+", swap");
                    }
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                } 
                // testing
                else if(test == true) {
                    displayArr("\n", arr);
                    System.out.print(" | "+arr[j]+" < "+arr[j+1]+", ok");
                }
    }
    
    public static void displayArr(String msg, int[] arr) {
        System.out.print(msg+"[");
        // reach each element
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
            // comma display
            if(i+1 < arr.length)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
