import java.util.HashMap;
import
public class DecryptString1309 {

    public String freqAlphabets(String s){
        // SLOW
        HashMap<String, Character> codex = new HashMap<>();
        codex.put("1", 'a');
        codex.put("2", 'b');
        codex.put("3", 'c');
        codex.put("4", 'd');
        codex.put("5", 'e');
        codex.put("6", 'f');
        codex.put("7", 'g');
        codex.put("8", 'h');
        codex.put("9", 'i');
        codex.put("10#", 'j');
        codex.put("11#", 'k');
        codex.put("12#", 'l');
        codex.put("13#", 'm');
        codex.put("14#", 'n');
        codex.put("15#", 'o');
        codex.put("16#", 'p');
        codex.put("17#", 'q');
        codex.put("18#", 'r');
        codex.put("19#", 's');
        codex.put("20#", 't');
        codex.put("21#", 'u');
        codex.put("22#", 'v');
        codex.put("23#", 'w');
        codex.put("24#", 'x');
        codex.put("25#", 'y');
        codex.put("26#", 'z');

        String result = "";
        char[] sarray = s.toCharArray();
        int i = 0;
        while (i < sarray.length){
            if(i < sarray.length - 2 && sarray[i + 2] == '#'){
                String key = ""+sarray[i]+sarray[i + 1]+sarray[i + 2];
                result = result + codex.get(key);
                i += 3;
            } else {
                String key = ""+sarray[i];
                result = result + codex.get(key);
                i++;
            }
        }
        return result;
    }

    public String freqAlphabetsImproved(String s){
        HashMap<String, Character> codex = new HashMap<>();
        int k = 1;
        for (char ch = 'a'; ch <= 'z'; ch++){
            if (ch < 'j'){
                codex.put(String.valueOf(k++), ch);
            } else {
                codex.put(String.valueOf(k++) + "#", ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#'){
                sb.append(codex.get(s.substring(i-2, i+1)));
                i -= 3;
            } else {
                sb.append(codex.get(s.substring(i, i + 1)));
                i--;
            }
        }
        return sb.reverse().toString();
    }
}
