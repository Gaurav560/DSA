package Chapter1.CH6BasicHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class FindHighestAndLowestFrequencyElementInArray {




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
    static int[] findFrequency(int[] arr) {
        int largest=findLargestElementInArray(arr);

        int[] arr1=new int[largest+1];
        for (int i = 0; i < arr.length ; i++) {
            arr1[arr[i]]++;

        }
        return arr1;
    }


    //finding highest frequency element
    static List<Integer> highestFrequencyElement(int[] arr){
int highestFrequency=0;
List<Integer> list=new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {

            if (highestFrequency<arr[i]){
                highestFrequency=arr[i];
                list.clear();
                list.add(i);
            } else if (highestFrequency==arr[i] && highestFrequency!=0) {
                list.add(i);

            }

        }
        return list;

    }




    //finding lowest frequency element
    static List<Integer> lowestFrequencyElement(int[] arr){

        int lowestFrequency=findLargestElementInArray(arr);
        List<Integer> list1=new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {

            if (lowestFrequency>arr[i]){
                lowestFrequency=arr[i];
                list1.clear();
                list1.add(i);
            } else if (lowestFrequency==arr[i] && lowestFrequency!=0) {
                list1.add(i);

            }

        }
        return list1;

    }
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 2,2, 3,5,5, 3, 4}; // Example usage
        System.out.println("Highest frequency elements are :"+highestFrequencyElement(findFrequency(arr)));
        System.out.println("Lowest frequency elements are :"+lowestFrequencyElement(findFrequency(arr)));

    }
}
