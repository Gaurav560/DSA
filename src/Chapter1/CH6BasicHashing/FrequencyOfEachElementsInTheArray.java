package Chapter1.CH6BasicHashing;

import java.util.HashMap;
import java.util.Map;


public class FrequencyOfEachElementsInTheArray {
    static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : arr) {
            // Increment the counter for each occurrence of a value
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4}; // Example usage
        Map<Integer, Integer> frequency = findFrequency(arr);
        System.out.println(frequency); // Print the frequency map
    }
}




