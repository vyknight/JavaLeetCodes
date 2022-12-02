public class ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s.length() == 1){ return 1; }
        char[] c = s.toCharArray();
        int biggestPower = 1;
        int temp = 1;
        for(int i = 1; i < c.length; i++){
            if(c[i] == c[i - 1]){
                temp++;
                if(temp > biggestPower){
                    biggestPower = temp;
                }
            } else {
                temp = 1;
            }
        }
        return biggestPower;
    }
}
