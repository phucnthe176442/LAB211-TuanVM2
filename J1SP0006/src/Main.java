package J1SP0006.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Random random = new Random();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // step 1: user enter a positive integer of array
        int sizeArr = getInt("Enter number of array:\n");
        // step 2: user enter a search value of positive integer
        int searchValue = getInt("Enter search value:\n");
        // step 3: generate random integer array
        int[] arr = generateIntArray(sizeArr);
        // step 4: sort and show generated array
        Arrays.sort(arr);
        displayArray("Sorted array: ", arr);
        // step 5: find and display index of search value by binary search
        // arr = new int[] {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        // searchValue = 6;
        // searchValue = 103;
        int index = BinarySearch.findIndex(arr, searchValue, false);
        // check if index = -1 --> not found
        if (index == -1)
            System.out.print("Not found the value in array!");
        else
            System.out.print("Found " + searchValue + " at index: " + index);
    }

    private static int getInt(String msg) {
        int inputNum;
        // loops infinity
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if (input.isEmpty())
                System.out.println("Input should not be empty");
            else {
                try {
                    inputNum = Integer.parseInt(input);
                    if (inputNum < 1)
                        System.out.println("Input should be positive integer");
                    else
                        break;
                } catch (Exception e) {
                    System.out.println("Input should be integer");
                }
            }
        }

        return inputNum;
    }

    private static int[] generateIntArray(int sizeArr) {
        int[] arr = new int[sizeArr];
        // loops from first to last index of element
        for (int i = 0; i < sizeArr; ++i)
            arr[i] = random.nextInt(sizeArr) + 1;
        return arr;
    }

    private static void displayArray(String msg, int[] arr) {
        System.out.print(msg + "[");
        int sizeArr = arr.length;
        // loops from first to last index of element
        for (int i = 0; i < sizeArr; ++i) {
            System.out.print(arr[i]);
            // check if reach last element
            if (i == sizeArr - 1)
                System.out.print("]\n");
            else
                System.out.print(", ");
        }
    }
}
