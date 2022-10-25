public class NumberComplement {
    public int findComplement(int num){
        String binNum = Integer.toBinaryString(num);
        char[] numCharArray = binNum.toCharArray();
        int ans = 0;
        int pow = 0;
        for(int i = numCharArray.length - 1; i >= 0; i--){
            if(numCharArray[i] == '0'){
                // complement is 1
                ans += Math.pow(2,pow); // turns out ^ is not power in java for some god forsaken reason
            } // else complement is 0
            pow++;
        }
        return ans;
    }
}
