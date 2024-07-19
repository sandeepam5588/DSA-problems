package ArrayPrograms;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(minCandies(ratings));
    }

    private static long minCandies(int[] ratings) {
        int N = ratings.length;
        if(N == 0)
            return 0;

        int[] candies = new int[N];
        Arrays.fill(candies, 1);

        //pass1: left to right
        for(int i=1; i<N; i++){
            if(ratings[i] > ratings[i-1])
                candies[i] = candies[i-1]+1;
        }
        //pass2: right to left
        for(int i=N-2; i>=0; i--){
            if(ratings[i] > ratings[i+1])
                candies[i] = Math.max(candies[i], candies[i+1]+1);
        }
        long totalCandies = 0L;
        for(int candy : candies)
            totalCandies += candy;

        return totalCandies;
    }
}
