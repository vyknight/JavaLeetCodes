public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i = arr.length - 1; i>= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
