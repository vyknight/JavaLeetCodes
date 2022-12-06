public class BinNumWithAlterantingBits {
    public boolean hasAlternatingBits(int n) {
        // convert number to binary
        String binn = Integer.toBinaryString(n);
        char[] charArr = binn.toCharArray();
        for(int i = 1; i < charArr.length; i++){
            if(charArr[i] == charArr[i-1]) return false;
        }
        return true;
    }

    public boolean hasAlternatingBitsFast(int n) {
        // using the fact that & is a bitwise operation
        // shifting the same number by one bit and using & should yield 0 if property is true
        n = n ^ (n >> 1);
        return (n & n + 1) == 0;
    }
}
