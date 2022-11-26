public class MergedSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int mi = 0;
        int ni = 0;
        int index = 0;
        while (mi < m && ni < n){
            if (nums1[mi] < nums2[ni]){
                temp[index] = nums1[mi];
                mi++;
            } else {
                temp[index] = nums2[ni];
                ni++;
            }
            index++;
            for(int x: temp){
                System.out.println(x);
            }
        }
        System.out.println("entering end case");
        if (mi < m){
            while (mi < m){
                temp[index] = nums1[mi];
                index++;
                mi++;
            }
        }
        else {
            System.out.println("else case!");
            while (ni < n){
                temp[index] = nums2[ni];
                index++;
                ni++;

            }
        }
        System.arraycopy(temp, 0, nums1, 0, temp.length);
    }
}
