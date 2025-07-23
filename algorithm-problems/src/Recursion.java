public class Recursion {

    // Factorial problem
    int factorial(int n) {
        if(n == 1 || n==0){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }

    // Fibonacci series problem
    /*
    0  1  2  3  4  5  6  7  8  9  10 .... etc
    0  1  1  2  3  5  8  13 21 34 55 .... etc
    */
    int fibonacci(int n) { // example n = 4
        if(n==0 || n==1){
            return n;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
            //              fibonacci(3)               +           fibonacci (2)           Answer => 3
            //                   2                                        1
            //                                                            |
            //
            //                                              fibonacci(1) + fibonacci(0)
            //                                                    1      +     0
            //                   |
            // fibonacci(2)      +         fibonacci(1)
            //      1                           1
            //      |
            // fibonacci(1) + fibonacci(0)
            //        1     +   0
        }
    }
    int n1=0, n2=1, n3;
    void printFibonacciSeries(int n){ // 3 2 1 0
        if(n>0){
            n3 = n1+n2; // 1 2 3
            n1 = n2; // 1 1 2
            n2 = n3; // 1 2 3
            System.out.print(" "+ n3); // 1 2 3
            printFibonacciSeries(n-1);
        }
    }

    int sumIntegersInRange(int n1, int n2){
        if(n1==n2){
            return n1;
        } else {
            if(n1 < n2){ // In case user give range between 4...6
                return n1 + sumIntegersInRange(n1+1, n2);
            }else { // In case user give range between 6...4
                return n1 + sumIntegersInRange(n1-1, n2);
            }
        }
    }
}
