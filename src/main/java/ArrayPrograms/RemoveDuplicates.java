package ArrayPrograms;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,6,6,6,7,7,7,7,8};
        int uniqueCount = removeDuplicate(arr);
    }

    private static int removeDuplicate(int[] arr) {
        int index = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1])
                arr[index++] = arr[i];
        }
        while(index < arr.length){
            arr[index++] = -1;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        return 0;
    }
}
