package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

/*
Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}
 */
public class PairDifference {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 2 };
        int n = arr.length;
        int k = 3;
        System.out.println("Count of pairs with given diff is "
                + countPairsWithDiffK(arr, n, k));
    }

    private static int countPairsWithDiffK(int[] arr, int n, int k) {
        if (arr.length == 0)
            return 0;
        Set<Integer> seenNumbers = new HashSet<>();
        int count = 0;
        for (int num : arr){
            int compliment = num + k;
            if(seenNumbers.contains(compliment)){
                ++count;
                seenNumbers.remove(compliment);
            }else {
                seenNumbers.add(compliment);
            }
        }
        return count;
    }

    public static void findPairsWithDifference(int[] arr, int k) {
        Set<Integer> elements = new HashSet<>();
        Set<String> pairs = new HashSet<>();

        for (int num : arr) {
            if (elements.contains(num - k)) {
                pairs.add((num - k) + "," + num);
            }
            if (elements.contains(num + k)) {
                pairs.add(num + "," + (num + k));
            }
            elements.add(num);
        }

        if (pairs.isEmpty()) {
            System.out.println("No pairs found with difference " + k);
        } else {
            System.out.println("Pairs with difference " + k + ":");
            for (String pair : pairs) {
                System.out.println(pair);
            }
        }
    }
}
