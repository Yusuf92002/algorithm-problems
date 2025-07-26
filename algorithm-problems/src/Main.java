public class Main {
    public static void main(String[] args) {
        // InsertionSort example
//        InsertionSort insertionSortExample = new InsertionSort();
//        int[] arr = {50,30,70,20,10};
//        insertionSortExample.insertionSort(arr,arr.length);
//        insertionSortExample.printArray(arr,arr.length);

        // Factorial (with recursion) example
//        Recursion factorialExample = new Recursion();
//        System.out.println(factorialExample.factorial(5));
//
//        // Fibonacci of a number example
//        Recursion fibonacciExample = new Recursion();
//        System.out.println(fibonacciExample.fibonacci(4));

        // Print fibonacci series given length of series example
//        Recursion printFibonacciSeriesExample = new Recursion();
//        System.out.print("0 " + "1"); // base
//        int num = 5;
//        printFibonacciSeriesExample.printFibonacciSeries(num-2);

        // Sum of all integers between two numbers example
//        Recursion sumIntegersInRangeExample = new Recursion();
//        System.out.println(sumIntegersInRangeExample.sumIntegersInRange(4,6));

        // MergeSort example
        MergeSort mergeSortExample = new MergeSort();
        int [] arr = {40, 30, 20, 60, 90, 33, 45};
        mergeSortExample.mergeSort(arr, 0, arr.length-1);
        mergeSortExample.printArray(arr, arr.length);
    }
}