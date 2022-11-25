import java.util.Arrays;

public class MinimumCandyCost {
    // following is fucked
    public int minimumCost(int[] cost) {
        // find largest candy value to subtract
        int max = 0;
        int biggest = 0;
        int[] count = new int[cost.length];
        for(int i = 0; i < cost.length - 1; i++){
            int candy = cost[i];
            if(candy > biggest){
                biggest = candy;
            }
            if(candy > max && candy < biggest){
                max = candy;
            }
            count[candy] = count[candy] + 1;
        }
        // find how many candies to subtract
        int toSubtract = (int) cost.length / 3;
        for(int i = max; i >= 0; i--){
            if(count[i] > 0){
                if(count[i] <= toSubtract){
                    toSubtract -= count[i];
                    count[i] = 0;
                }
                else{
                    count[i] = count[i] - toSubtract;
                    toSubtract = 0;
                }
                if (toSubtract == 0){
                    break;
                }
            }
        }
        // sum
        int sum = 0;
        for(int i = 0; i < count.length; i++){
            sum = count[i] * i;
        }
        return sum;
    }

    public int minimumCostFixed(int[] cost){
        Arrays.sort(cost);
        int res = 0, n = cost.length;
        for (int i = 0; i < n; ++i){
            if (i % 3 != n % 3){
                res += cost[i];
            }
        }
        return res;
    }
}
