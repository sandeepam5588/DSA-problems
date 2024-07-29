package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;
/*
    Given an array of positive and negative numbers,
    the task is to find if there is a subarray (of size at least one) with 0 sum.
 */
public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-3, 2, 3, 1, 6};
        if(findZeroSumSubArray(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean findZeroSumSubArray(int[] arr) {
        Set<Integer> sums = new HashSet<>();
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (i == 0 || sum == 0 || sums.contains(sum))
                return true;
            sums.add(sum);
        }
        return false;
    }
}
