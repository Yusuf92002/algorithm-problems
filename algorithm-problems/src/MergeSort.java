public class MergeSort {

    //                  0   1   2   3   4   5   6
    // example Array : {40, 30, 20, 60, 90, 33, 45}
    void merge (int [] arr, int left, int middle, int right){  // (left 0, right 6)

        // middle = left + (right - left) / 2;
        int i, j, k;
        int sizeOfArr1 = middle - left + 1 ; // first sub-array is arr1[left...m]
        int sizeOfArr2 = right - middle ; // second sub-array is arr2[m+1...right]
        int[] arr1 = new int[sizeOfArr1];
        int[] arr2 = new int[sizeOfArr2];

        for(i = 0; i<sizeOfArr1; i++){
            arr1[i] = arr[left+i];
        }
        for(j = 0; j<sizeOfArr2; j++){
            arr2[j] = arr[middle+1+j];
        }

       i = 0;j = 0;
       k = left;

       while(i<sizeOfArr1 && j<sizeOfArr2){
           if(arr1[i] <= arr2[j]){
               arr[k] = arr1[i];
               i++;
           }else {
               arr[k] = arr2[j];
               j++;
           }
           k++;
       }

       while(i<sizeOfArr1){
           arr[k] = arr1[i];
           i++; k++;
       }
       while(j<sizeOfArr2){
           arr[k] = arr2[j];
           j++; k++;
       }

    }

    void mergeSort(int [] arr, int left, int right){
        if(left < right){
            int middle = left + (right - left)/2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle+1, right);
            merge(arr, left, middle, right);
        }
    }

    void printArray(int [] arr, int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }


}
