import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    // my solution
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        char[] c = s.toCharArray();
        int longest = 1;
        System.out.println("loop starts");
        for (int i = 0; i < c.length; i++){
            System.out.println("cur head = " + c[i]);
            HashSet<Character> used = new HashSet<>();
            used.add(c[i]);
            int streak = 1;
            for (int j = i + 1; j < c.length; j++){
                System.out.println("checking " + c[j]);
                if(used.contains(c[j])) break;
                streak++;
                used.add(c[j]);
            }
            if (streak > longest) longest = streak;
        }
        return longest;
    }
    // premium solution
    // we use hashed map to keep track of used characters and when we run into a repeat we make i repeat index + 1
    // using character as the keys for comparison's sake btw
    public int sol(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++){
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
