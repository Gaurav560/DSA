package Chapter2.SortingTechniques1;

import java.util.Arrays;

public class SelectionSort {

    static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int smallest=arr[i];
            for (int j =i+1; j < arr.length; j++) {
                if (smallest>arr[j]){
                    smallest=arr[j];
                }

            }



            
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr=new int[]{105,3,101,55,8,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
