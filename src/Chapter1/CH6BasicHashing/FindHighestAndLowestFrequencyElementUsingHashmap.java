package Chapter1.CH6BasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindHighestAndLowestFrequencyElementUsingHashmap {
    static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : arr) {
            // this getOrDefault will return a value for a key
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        return frequencyMap;
    }


    static List<Integer> findHighestFrequencyElement(Map<Integer, Integer> map) {
        int highestFrequency = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
                list.clear();
                list.add(entry.getKey());
            } else if (highestFrequency == entry.getValue() && highestFrequency != 0) {
                list.add(entry.getKey());
            }

        }
        return list;
    }



    static List<Integer> findLowestFrequencyElement(Map<Integer, Integer> map) {
        int lowestFrequency = Integer.MAX_VALUE;
        List<Integer> list1 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < lowestFrequency) {
                lowestFrequency = entry.getValue();
                list1.clear();
                list1.add(entry.getKey());
            } else if (lowestFrequency == entry.getValue() && lowestFrequency != 0) {
                list1.add(entry.getKey());
            }

        }
        return list1;
    }



    //tc: O(n)+O(m)+O(m)
    //sc: O(m)+O(m)+O(m)
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 2,2, 3, 5,5, 3, 4}; // Example usage
        System.out.println("Highest Frequency Element:"+findHighestFrequencyElement(findFrequency(arr)));
        System.out.println("LowestFrequencyElement"+findLowestFrequencyElement(findFrequency(arr)));
    }
}
