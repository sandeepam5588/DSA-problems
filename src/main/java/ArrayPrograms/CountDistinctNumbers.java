package ArrayPrograms;

import java.util.Arrays;

public class CountDistinctNumbers {
    public static void main(String[] args) {
        int arr[] = { 1,1,1,1,1,2};
        System.out.println(countDistinct(arr, arr.length));
    }

    private static int countDistinct(int[] arr, int n) {
        int count = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            while(i < n-1 && arr[i] == arr[i+1]){
                ++i;
            }
            ++count;
        }
        return count;
    }
}
