package Arrays2D;

import java.util.Arrays;
import java.util.Comparator;

public class Carfleet {
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};

        int result = carFleet(target, position, speed);
        System.out.println("Number of car fleets: " + result);
    }

    private static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if(n == 0)
            return 0;

        double[][] cars = new double[n][2];
        for(int i=0; i<n; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) /speed[i];
        }

        Arrays.sort(cars, Comparator.comparingDouble(a -> -a[0]));

        int fleets = 0;
        double currentFleetTime = 0;

        for(int i=0; i<n; i++){
            double time = cars[i][1];
            if(time > currentFleetTime){
                fleets++;
                currentFleetTime = time;
            }
        }
        return fleets;
    }
}

