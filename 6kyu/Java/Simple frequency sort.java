// In this kata, you will sort elements in an array by decreasing frequency of elements. If two elements have the same frequency, 
        //sort them by increasing value.

// Solution.sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7});
// // Returns {3, 3, 3, 5, 5, 7, 7, 2, 9}
// // We sort by highest frequency to lowest frequency.
// // If two elements have same frequency, we sort by increasing value.
// More examples in test cases.

package 6kyu.Java;

// public class Simple frequency sort {
    
    import java.util.*;

public class Solution {
    public static int[] sortByFrequency(int[] array) {
        // Step 1: Count frequency of each element
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : array) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert array to a List for easy sorting
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        // Step 3: Sort using custom comparator
        list.sort((a, b) -> {
            int freqCompare = freq.get(b) - freq.get(a); // higher freq first
            if (freqCompare == 0)
                return a - b; // if same frequency, smaller value first
            return freqCompare;
        });

        // Step 4: Convert list back to int[]
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 5, 3, 7, 9, 5, 3, 7};
        System.out.println(Arrays.toString(sortByFrequency(input)));
    }
}
