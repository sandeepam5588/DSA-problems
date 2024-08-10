package ArrayPrograms;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,0,1};
        moveZeros(arr);
    }

    private static void moveZeros(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[index++] = arr[i];

        while (index < arr.length)
            arr[index++] = 0;

        for (int ele : arr)
            System.out.print(ele + " ");
    }
}
