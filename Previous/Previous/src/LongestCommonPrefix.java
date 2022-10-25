public class LongestCommonPrefix {
    // SLOW !
    public String longestCommonPrefix(String[] strs){
        if(strs.length <= 1){
            return strs[0];
        }

        String prefix = strs[0];
        char[] wordArray;
        char[] prefixArray;
        String temp;

        for (int k = 1; k < strs.length; k++){

            wordArray = strs[k].toCharArray();
            prefixArray = prefix.toCharArray();

            int i = 0;
            while (i < wordArray.length){
                if (i > prefixArray.length - 1){
                    break;
                }
                else if (wordArray[i] != prefixArray[i]){
                    break;
                } else {
                    i++;
                }
            }

            temp = "";
            for (int j = 0; j < i; j++){
                temp += prefixArray[j];
            }
            prefix = temp;
        }

        return prefix;
    }

    public String longestCommonPrefixWithIndexOf(String[] strs){
        if (strs == null || strs.length == 0){ return ""; }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){ // loops until we've shaved off enough of prefix for it to work with index Of
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
