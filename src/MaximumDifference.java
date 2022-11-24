public class MaximumDifference {
    public int maximumDifference(int[] nums) {
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int diff = nums[j] - nums[i];
                if (diff > 0 && diff > max){
                    max = diff;
                }
            }
        }
        return max;
    }
}
