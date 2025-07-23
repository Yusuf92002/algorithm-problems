public class InsertionSort {
    void insertionSort (int[] arr, int n){
        int key,j;                 // 0   1  2  3  4
        for(int i = 1 ; i<n ; i++) // 50| 30 70 20 10
        {
            key = arr[i];
            j = i-1;
            // For descending order, change to arr[j] < key
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    void printArray (int[] arr, int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
