package LeetCodeAlgorithms;

/**
 * @author RoohiAisha
 */
public class ValidPalindrome {
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
//        String s ="race a car";
        System.out.println("The string input is" + isValidPalindrome(s));
    }

    public static boolean isValidPalindrome(String s){
        boolean result = false;

        String tempString = s.toLowerCase().replaceAll("[^0-9A-Za-z]","");

        char[] arr = tempString.toCharArray();

        int i = 0;
        int j = arr.length-1;

        while(i<=j)
        {
            if((arr[i]-arr[j])!=0){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
