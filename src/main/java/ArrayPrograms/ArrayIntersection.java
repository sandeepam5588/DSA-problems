package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {2, 3, 5, 6};

        int[] intersection = findIntersection(array1, array2);

        System.out.print("Intersection of the two arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        // Add all elements of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }

        // Check each element of the second array; if it's in the set, add to intersection
        for (int num : array2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the set to an array
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    }
}

