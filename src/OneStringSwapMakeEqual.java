import java.util.Arrays;

public class OneStringSwapMakeEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        // ineffec
        if(s1.length() == 1 && s2.length() == 1){
            return s1.equals(s2);
        }
        for(int i = 0; i < s2.length(); i++){
            for(int j = 1; j < s2.length(); j++){
                char[] temp = s2.toCharArray();
                char tempChar = temp[i];
                temp[i] = temp[j];
                temp[j] = tempChar;
                if (Arrays.equals(temp, s1.toCharArray())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onePassSolution(String s1, String s2) {
        int swap = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i < s1.length() &&  swap < 2 ; i++)
        {
            int x = s1.charAt(i);
            int y = s2.charAt(i);

            if (a == y && b == x) {
                a = 0;
                b = 0;
            }
            else if (x != y) {
                swap++;
                a = x;
                b = y;
            }
        }
        return a+b == 0 && swap < 2;
    }
}
