package Chapter1.CH6BasicHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class FrequencyOfEachElementsInTheArray {
//    static Map<Integer, Integer> findFrequency(int[] arr) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int value : arr) {
//            // Increment the counter for each occurrence of a value
//            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
//        }
//        return frequencyMap;
//    }


    static  int findLargestElementInArray(int[] arr){
        int largest=0;
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]){
                largest=arr[i];
            }

        }
        return largest;
    }

    //tc: O(N) + O(N) + O(M) ,where N is no of elements in the original array and m is the highest element in the array
    //sc: O(M) as using extra space.
    static void findFrequency(int[] arr) {
        int largest=findLargestElementInArray(arr);

        int[] arr1=new int[largest+1];
        for (int i = 0; i < arr.length ; i++) {
            arr1[arr[i]]++;

        }
     //   System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i+" :"+arr1[i]);

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3,5, 3, 4}; // Example usage
        findFrequency(arr);
    }
}




