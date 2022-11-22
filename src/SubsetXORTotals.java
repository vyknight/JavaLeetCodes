public class SubsetXORTotals {
    public int subsetXORSum(int[] nums) {
//        int xor_total = 0;
//        for (int i = 0; i < nums.length; i++){
//            for (int j = 0; j <  i; j++){
//                int temp_xor_total = 0;
//                for (int k = j; k < i; k++){
//                    temp_xor_total = temp_xor_total ^ nums[k];
//                }
//                xor_total += temp_xor_total;
//            }
//        }
//        return xor_total;
        return recurse(nums, 0, 0);
    }

    public int recurse(int[] nums, int index, int currentXor){
        if (index == nums.length) return currentXor;
        int withElement = recurse(nums, index + 1, currentXor ^ nums[index]);
        int withoutElement = recurse(nums, index + 1, currentXor ^ nums[index]);
        return withElement + withoutElement;
    }
}
