package J1SP0010.src;

public class LinearSearch {
    public static int findIndex(int[] arr, int searchValue) {
        int index = -1;
        // loops from first to last index of element
        for(int i = 0; i < arr.length; ++i)
            // check if current value equal to search value --> found result
            if(arr[i] == searchValue) {
                index = i;
                break;
            }
        return index;
    }
}
