package ArrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Check if pair with given Sum exists in Array
Example [1, 2, 7, 3, 6, -9, 11]
number = 9
 */
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 0, -9, 11};
        int targetSum = 0;
        if(hasPairWithSumOptimised(arr, targetSum)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean hasPairWithSum(int[] arr, int targetSum) {
        if(arr.length == 0)
            return false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                if (i !=j && arr[i] + arr[j] == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasPairWithSumOptimised(int[] arr, int targetSum) {
        if (arr.length == 0)
            return false;
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : arr) {
            int compliment = targetSum - num;
            if (seenNumbers.contains(compliment))
                return true;
            else
                seenNumbers.add(num);
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}