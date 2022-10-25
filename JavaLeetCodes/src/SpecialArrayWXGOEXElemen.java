import java.util.Arrays;

public class SpecialArrayWXGOEXElemen{
    /*
     originally tried to do some shit where i sorted the list, then I looped through every integer from 1 to nums.length
     and then find it's "rightful place" in the list, then see how many elements are left using i
     but that was 1) too complicated and 2) too inefficient because it was O(n^2) pretty sure
    */
    public int specialArray(int[] nums) {
        // the idea behind this solution is to literally add up all the occurrences of numbers of each value
        // and then count down see when it matches
        // insight is that x cannot be bigger than length, so values higher than that can be put in the same bucket
        int len = nums.length;
        int[] counts = new int[len + 1];
        for (int i: nums){
            if(i >= len){counts[len]++;}
            else{counts[i]++;}
        }
        int res = 0;
        for(int i = counts.length - 1; i > 0; i--){
            res += counts[i];
            if (res == i){return i;}
        }
        return -1;
    }

}
