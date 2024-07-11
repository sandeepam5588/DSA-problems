package ArrayPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
class ArraySubset {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 5, 2, 23, 19};
        int[] arr2 = new int[]{19, 5, 2};
        if(isSubset(arr1, arr2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    // public static boolean isSubset(int[] arr1, int[] arr2){
    //     for(int i=0;i<arr2.length;i++){
    //         boolean isPresent = false;
    //         for(int j=0;j<arr1.length;j++){
    //             if(arr2[i] == arr1[j]){
    //                 isPresent = true;
    //                 break;
    //             }
    //         }
    //         if(isPresent == false)
    //             return false;
    //     }
    //     return true;
    // }

    // public static boolean isSubset(int[] arr1, int[] arr2){
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);

    //     int ptr1 =0, ptr2 = 0;
    //     while(ptr1 <= arr1.length-1 && ptr2 <= arr2.length-1){
    //         if(arr1[ptr1] == arr2[ptr2]){
    //             ++ptr1;
    //             ++ptr2;
    //         }else if(arr1[ptr1] < arr2[ptr2] ){
    //             ++ptr1;
    //         }
    //         else
    //             return false;
    //     }
    //     return true;
    // }

    public static boolean isSubset(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            if(!set.contains(i))
                return false;
        }
        return true;
    }
}
