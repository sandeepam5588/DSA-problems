package ArrayPrograms;

public class MinSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int result = findMinSumSubArray(arr, k);
        System.out.println("The minimum sum of a subarray of size " + k + " is " + result); // Output: The minimum sum of a subarray of size 4 is 6
    }

    private static int findMinSumSubArray(int[] arr, int k) {
        if(arr.length < k){
            throw new RuntimeException("illegal argument:K is less than array size");
        }
        int windSum = 0;
        for(int i=0; i<k; i++){
            windSum += arr[i];
        }
        int minSum = windSum;
        for(int i=k; i< arr.length; i++){
            windSum += arr[i] - arr[i-k];
            minSum = Math.min(windSum, minSum);
        }
        return minSum;
    }
}
