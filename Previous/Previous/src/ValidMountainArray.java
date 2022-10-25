public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
            if(arr.length < 3){ return false;}
            int indexOfLargest = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > arr[indexOfLargest]){
                    indexOfLargest = i;
                }
            }
            System.out.println("index of largest:" + indexOfLargest);
            if(indexOfLargest == 0 || indexOfLargest == arr.length - 1){ return false; }
            int prev = arr[indexOfLargest];
            for(int i = indexOfLargest - 1; i >= 0; i--){
                System.out.println("checking index " + i);
                if(arr[i] >= prev){
                    return false;
                }
                prev = arr[i];
            }
        System.out.println("left all good");
            prev = arr[indexOfLargest];
            for(int i = indexOfLargest + 1; i < arr.length; i++){
                System.out.println("checking index " + i);
                if(arr[i] >= prev){
                    return false;
                }
                prev = arr[i];
            }
        System.out.println("right all good");
            return true;
    }
}

/*
Elegant Solution :
2 while loops go from both ends, stop when it starts to decrease
Return whether these two loops end on the same index

"2 people climbs a mountain from two sides, they should meet at the same point.
 */