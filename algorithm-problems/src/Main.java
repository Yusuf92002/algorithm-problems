public class Main {
    public static void main(String[] args) {
        // InsertionSort example
        InsertionSort insertionSortExample = new InsertionSort();
        int[] arr = {50,30,70,20,10};
        insertionSortExample.insertionSort(arr,arr.length);
        insertionSortExample.printArray(arr,arr.length);
    }
}