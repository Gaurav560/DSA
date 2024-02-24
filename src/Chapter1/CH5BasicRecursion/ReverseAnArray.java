package Chapter1.CH5BasicRecursion;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {

    //brute force by taking a new array and storing all elements from first array
//    static  int[] reverseArr(int[] arr){
//        int[]  arr1=new int[arr.length];
//        int j=0;
//        for (int i = arr.length-1 ; i >=0; i--) {
//          arr1[j]=arr[i];
//          j++;
//
//        }
//        return arr1;
//    }



    //optimized approach .
    // not using an extra array(iterative way : tc: O(N) and sc: O(1) as we are using an extra array)
//    static  int[] reverseArr(int[] arr){
//
//      int j=arr.length-1;
//        for (int i =0; i<arr.length/2 ;i++) {
//            int temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
//     j--;
//        }
//        return arr;
//    }



    //recursive approach(tc: O(N) as it had to traverse the array ,sc: O(1))
//    static  int[] reverseArr(int[] arr, int start, int end){
//        if(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            reverseArr(arr,start+1,end-1);
//        }
//        return arr;
//    }





    //using in built library
    static  Integer[] reverseArr(Integer[] arr){

        Collections.reverse(Arrays.asList(arr));
        return arr;
    }


    public static void main(String[] args) {
        Integer[] arr={4,6,7,8,5};
        System.out.println(Arrays.toString(reverseArr(arr)));
    }
}
