package J1SP0001.src;
import java.util.Scanner;
/**
 *
 * @author phucnthe176442
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // step1: get integer number
        int num = getInt("Enter number of array:\n");
        // step2: random integer number array
        int[] arr = randIntArr(num);
        // step3: show unsorted array
        displayArr("Unsorted array: ", arr);
        // step4: sort array
        // arr = new int[5];
        // arr[0] = 5;
        // arr[1] = 1;
        // arr[2] = 12;
        // arr[3] = -5;
        // arr[4] = 16;
        sortArr(arr, false);
        // step5: show sorted array
        displayArr("\nSorted array: ", arr);
    }
    
    private static int getInt(String msg) {
        String num;
        // loops until get correct input
        while(true) {
            System.out.print(msg);
            num = sc.nextLine();
            num = num.trim();
            // accept input
            if(Validation.validateInt(num) == true)
                break;
        }
        return Integer.parseInt(num);
    }
    
    private static int[] randIntArr(int num) {
        return Array.randIntArr(num);
    }
    
    private static void sortArr(int[] arr, boolean test) {
        Array.sortArr(arr, test);
    }
    
    private static void displayArr(String msg, int[] arr) {
        Array.displayArr(msg, arr);
    }
}
