import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));




    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0)
            return 0;
        if (customers.length == 1)
            return customers[0];
        int[] arr = new int[n];
        arr[0] = customers[0];
        int index = 0;
        for (int i = 1; i < customers.length; i++) {
            int min = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[index] + customers[i];
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

}
