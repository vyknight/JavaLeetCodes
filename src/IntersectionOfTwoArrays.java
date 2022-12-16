import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    // for some reason the damned retainAll didn't work?
    public int[] intersectionFirstTry(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);
        int[] arr = new int[set1.size()];
        int i = 0;
        for(int x: set1){
            arr[i++] = x;
        }
        return arr;
    }
    // ripped
    // but the logic is exactly the same
    // like how does java not have better built in set operations
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> intersect = new HashSet<>();
        for (int x: nums2){
            if (set1.contains(x)){
                intersect.add(x);
            }
        }
        int[] rtrn = new int[intersect.size()];
        int i = 0;
        for(int num: intersect){
            rtrn[i++] = num;
        }
        return rtrn;
    }
}
