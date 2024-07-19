package ArrayPrograms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
Given an array, arr[0..n-1] of distinct elements and a range [low, high], find all numbers that are in a range, but not the array. The missing elements should be printed in sorted order.

Examples:

Input: arr[] = {10, 12, 11, 15},
       low = 10, high = 15
Output: 13, 14
Input: arr[] = {1, 14, 11, 51, 15},
       low = 50, high = 55
Output: 50, 52, 53, 54 55
 */

public class MissingElementsOfaRange {
    public static void main(String[] args) {
        int[] numbers = {1, 14, 11, 51, 15};
        int low = 50;
        int high = 55;
        findMissingElements(numbers, low, high);
    }

    private static void findMissingElements(int[] numbers, int low, int high) {
        Set<Integer> numbersSet = new HashSet<>();
        for(int num : numbers)
            numbersSet.add(num);

        for(int i=low; i<=high; i++){
            if(!numbersSet.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
