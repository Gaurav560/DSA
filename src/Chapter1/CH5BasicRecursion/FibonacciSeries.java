package Chapter1.CH5BasicRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {


    //brute force : tc: O(N)+O(N) and sc: O(N)
//    static int[] findFibonacci(int n){
//
//        int[] arr=  new int[n+1];
//        //we are taking size of array n+1 because of 0 based
//        //indexing of fibonacci series
//        arr[0]=0;
//        arr[1]=1;
//        for (int k = 2; k <=n ; k++) {
//     arr[k]=arr[k-1]+arr[k-2];
//        }
//        return arr;
//    }



//tc: O(2^N) ans sc: O(N)  At maximum there could be N function calls waiting in the recursion stack since we need to calculate the Nth Fibonacci
// number for which we also need to calculate (N-1) Fibonacci numbers before it
    static int findFibonacci(int n){

        if (n==0 || n==1){
            return n;
        }else {
            return findFibonacci(n-1)+findFibonacci(n-2);
        }

}



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter upto which number you want to print the fibonacci series: ");
        int n=scanner.nextInt();
        for (int i = 0; i <=n ; i++) {
            System.out.print(findFibonacci(i)+" ");
        }



    }
}
