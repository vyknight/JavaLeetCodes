import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        char[] nA = s.toCharArray();

        if (nA.length == 1){
            return dictionary.get(nA[0]);
        }

        int i = 0;
        int sum = 0;
        int curr;
        int next;
        while (i <= nA.length - 2){
            curr = dictionary.get(nA[i]);
            next = dictionary.get(nA[i + 1]);

            if (curr >= next) {
                sum += curr;
                i++;
            } else {
                sum += (next - curr);
                i += 2;
            }
        }
        if (dictionary.get(nA[nA.length - 2]) >= dictionary.get(nA[nA.length - 1])) {
            sum += dictionary.get(nA[nA.length - 1]);
        }


        return sum;
    }
}
