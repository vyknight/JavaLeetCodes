public class BinarySearch {
    // I would like to say that it's because I'm under slept but I forgot how to implement this elementary algo for a solid 5 min
    public int search(int[] nums, int target) {
        int b = 0;
        int e = nums.length - 1;
        while (b <= e){
            int mid = (b + e) / 2;
            if(nums[mid] == target) return mid;
            if (nums[mid] < target){
                b = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
