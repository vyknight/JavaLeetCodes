public class ReplaceWithGreatestToRight {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        int curr;
        for(int i = arr.length - 1; i >= 0; i--){
            curr = arr[i];
            arr[i] = rightMax;
            if (curr > rightMax){
                rightMax = curr;
            }
        }
        return arr;
    }
}
