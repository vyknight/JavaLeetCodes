import java.util.HashMap;

public class IntegerToRoman {
    public String intToRoman(int num){
        int initNum = num;
        int modifiedNum = num;
        String result = "";
        // define ones
        HashMap<Integer, String> ones = new HashMap<>();
        ones.put(1, "I");
        ones.put(10, "X");
        ones.put(100, "C");
        ones.put(1000, "M");
        // define fives
        HashMap<Integer, String> fives = new HashMap<>();
        fives.put(1, "V");
        fives.put(10, "L");
        fives.put(100, "D");

        int decimalPlace = 1;
        int value;
        String one;
        String five;

        while (decimalPlace < initNum){
            value = modifiedNum % 10;
            one = ones.get(decimalPlace);
            five = fives.get(decimalPlace);

            if (value == 4){
                result = one + five + result;
                continue;
            }
            if (value == 9){
                result = one + ones.get(decimalPlace * 10) + result;
                continue;
            }
            String digit = "";
            while (value > 0){
                if (value >= 5){
                    digit += five;
                    value -= 5;
                } else {
                    digit += one;
                    value--;
                }
            }

            result = digit + result;

            decimalPlace *= 10;
            modifiedNum /= 10;
        }

        return result;

    }



//    public String intToRoman(int num){
//        int initNum = num;
//        String rn = ""; // roman numerals we'll concatenate on
//
//        // dictionary for converting integer value into strings
//        HashMap<Integer, String> exceptions = new HashMap<>();
//        // inverted because the string will be inverted
//        exceptions.put(4, "VI");
//        exceptions.put(9, "XI");
//        exceptions.put(40, "LX");
//        exceptions.put(90, "CX");
//        exceptions.put(400, "DC");
//        exceptions.put(900, "MC");
//
//        HashMap<Integer, String> fives = new HashMap<>();
//        // only need decimal place
//        fives.put(1, "V");
//        fives.put(10, "L");
//        fives.put(100, "D");
//
//        HashMap<Integer, String> ones = new HashMap<>();
//        // only need decimal place
//        ones.put(1, "I");
//        ones.put(10, "X");
//        ones.put(100, "C");
//        ones.put(1000, "M");
//
//        // go through the integer right to left.
//        int decimalPlace = 1;
//        int value;
//        while (decimalPlace < initNum){
//            value = num % 10;
//            if (value == 4 || value == 9){
//                // handle these exceptional numbers
//                rn = rn + exceptions.get(value * decimalPlace);
//                continue;
//            }
//            while (value > 0){
//                if (value == 5){
//                    rn = rn + fives.get(decimalPlace);
//                    value -= 5;
//                } else {
//                    rn = rn + ones.get(decimalPlace);
//                    value--;
//                }
//            }
//            num = num / 10;
//            decimalPlace = decimalPlace * 10;
//        }
//
//        // invert rn string
//        char[] rnc = rn.toCharArray();
//        String rev = "";
//        for (int i = rnc.length - 1; i >= 0; i--){
//            rev = rev + rnc[i];
//        }
//
//        return rev;
//
//    }
}
