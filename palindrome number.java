class Solution {
    public boolean isPalindrome(int x){
        // check edge cases 
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int revertedNum = 0;
        while (x > revertedNum){
            // gets the last digit from x while bumping the previous digits up 
            revertedNum = revertedNum * 10 + x % 10;
            // since we only need to compare half of x 
            x /= 10;
        }

        // the / 10 case removes the middle number if there exists one 
        return (x == revertedNum || x == revertedNum / 10);
    }
}