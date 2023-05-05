package J1SP0006.src;

public class BinarySearch {
    private static final String[] comparisions = { " == ", " > ", " < " };

    private static void displayStep(int[] arr, int searchValue, int steps, int id, int type) {
        System.out.print("Step " + steps + " (middle element is " + arr[id] + comparisions[type]
                + searchValue + "): ");
        // loops from first to last index of element
        for (int i = 0; i < arr.length; ++i) {
            // check if current element is considered value
            if (i == id)
                System.out.print(arr[i] + "] ");
            // check if current element is previous of considered value
            else if(i + 1 == id)
                System.out.print(arr[i] + " [");
            else 
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findIndex(int[] arr, int searchValue, boolean test) {
        int index = -1, leftBound = 0, rightBound = arr.length - 1;
        // loops from first step until left bound > right bound
        for (int steps = 1; leftBound <= rightBound; ++steps) {
            int middleIndex = (leftBound + rightBound) / 2;
            // check if middle element equal to search value
            if (arr[middleIndex] == searchValue) {
                index = middleIndex;
                // check if test = true
                if (test)
                    displayStep(arr, searchValue, steps, middleIndex, 0);
                break;
            }
            // check if middle element greater than search value
            if (arr[middleIndex] > searchValue) {
                rightBound = middleIndex - 1;
                // check if test = true
                if (test)
                    displayStep(arr, searchValue, steps, middleIndex, 1);
            } else {
                leftBound = middleIndex + 1;
                // check if test = true
                if (test)
                    displayStep(arr, searchValue, steps, middleIndex, 2);
            }

            // check if out loops and test = true -> display last step
            if (leftBound > rightBound && test) {
                steps++;
                System.out.print("Step " + steps + " (searched value is absent): ");
                // loops from first to last index of element
                for (int i = 0; i < arr.length; ++i)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
        return index;
    }
}
