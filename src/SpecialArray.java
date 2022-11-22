public class SpecialArray {
    /*
    Special Array With X Elements Greater Than or Equal X
     */
    public int specialArray(int[] nums){
        int[] numbers = new int[nums.length + 1];
        int max_val = nums.length - 1;
        for (int x: nums){
            if (x <= max_val){
                numbers[x] = numbers[x] + 1;
            } else {
                numbers[nums.length] = numbers[nums.length] + 1;
            }
        }
        int res = 0;
        for (int i = numbers.length - 1; i >= 0; i--){
            res += numbers[i];
            if (i == res){ return i; }
        }
//        for (int i =0; i < numbers.length; i++){
//            for (int j = 0; j < numbers.length; j++){
//                numbers[i] += numbers[j];
//            }
//        }
//        for (int i = 0; i <= max_val; i++){
//            if(i == numbers[i]){
//                return i;
//            }
//        }
        return -1;
    }
}
