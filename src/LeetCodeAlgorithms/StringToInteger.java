package LeetCodeAlgorithms;

/**
 * @author RoohiAisha
 */
public class StringToInteger {

    public static void main(String[] args) {
//        String s = "1337c0d3";
        String s = " -042";
        //String s =  "1337c0d3";
        //String s = "words and 987";
        System.out.println(StringToInteger(s));
    }

    public static long StringToInteger(String s) {

        //whitespace condition
        s = s.trim();
        long num = 0;

        if (s.isEmpty()) {
            return 0;
        }

        //signedness condition
        int i = 0;
        int sign = 1;
        int n = s.length();

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            num = (num * 10) + (s.charAt(i)-'0');

            if(num*sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(num*sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign*num);

    }

}
