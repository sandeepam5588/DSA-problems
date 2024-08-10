package StringProblems;

import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        String numbers = "2,5,46,4,5,5,2";
        countFrequencyOfNums(numbers);
    }

    private static void countFrequencyOfNums(String numbers) {
        String[] nums = numbers.split(",");
        int MAX = 1000;
        int[] frequency = new int[MAX];
        for (String num : nums)
            frequency[Integer.parseInt(num)]++;

        for (int i = 0; i < frequency.length; i++)
            if(frequency[i] > 0)
                System.out.println(i+" occurred "+ frequency[i]+ " times");
    }
}
