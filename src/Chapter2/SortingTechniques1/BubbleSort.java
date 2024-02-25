package Chapter2.SortingTechniques1;

import java.util.Arrays;

public class BubbleSort {


    //tc: O(n^2)
    static  int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                     int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }


            }
        }




        return  arr;

    }
    public static void main(String[] args) {
        int[] arr=new int[]{105,3,101,55,8,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
}
