import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {

    }

    public boolean checkIfStringNice(String s) {
        Set<Character> required = new HashSet<>();
        char[] sarray = s.toCharArray();
        for(char x: sarray){
            if (required.contains(x)){
                required.remove(x);
            }
            else if (Character.isUpperCase(x)){
                required.add(Character.toLowerCase(x));
            }
            else {
                required.add(Character.toUpperCase(x));
            }
        }
        return required.isEmpty();
    }
}
