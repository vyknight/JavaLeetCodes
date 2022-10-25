import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s){
        Stack<Character> e = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '(': e.push(')');
                case '[': e.push(']');
                case '{': e.push('}');
                default: if(e.empty() || e.pop() != s.charAt(i)){ return false; }
            }
        }
        return e.empty();
    }
//    public boolean isValid(String s){
//        // BUT THIS DOESNT HANDLE BAD NESTING!
//
//        // () a {} b [] c
//        int acount = 0;
//        int bcount = 0;
//        int ccount = 0;
//
//        for (int i = 0; i < s.length() - 1; i++){
//            switch (s.charAt(i)){
//                case '(': acount++;
//                case '{': bcount++;
//                case '[': ccount++;
//                case ')': acount--;
//                case '}': bcount--;
//                case ']': ccount--;
//            }
//        }
//        return (acount == 0) && (bcount == 0) && (ccount == 0);
//    }

    // THIS ONLY WORKS FOR WHEN BRACKETS ARE GUARANTEED TO BE NESTED, NOT ()[]{} AND SHIT
    public boolean isValidNested(String s){
        // if a string opens with a bracket it has to end with the same bracket
        // make this bitch recursive
        HashMap<String, String> ends = new HashMap<>();
        ends.put("(", ")");
        ends.put("{", "}");
        ends.put("[", "]");

        if (s.length() == 2){
            return ends.get(s.substring(0,1)).equals(s.substring(1));
        }
        if (s.length() < 2){
            return false;
        }
        return ends.get(s.substring(0, 1)).equals(s.substring(s.length() - 1))
                && isValidNested(s.substring(1, s.length() - 2));
    }
}
