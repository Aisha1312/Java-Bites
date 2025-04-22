package LeetCodeAlgorithms;

/**
 * @author RoohiAisha
 */
public class ValidAnagram {

    public static void main(String args[]){
//        String s = "anagram";
//        String s2 = "nagaram";

        String s1 = "cat";
        String s2 = "car";
        System.out.println("The given string is anagram "+ isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s, String t) {

        int[] arr = new int[26];


        for (int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int j=0; j<t.length();j++){
            arr[t.charAt(j)-'a']--;
        }

        for(int k : arr){
            if(k!=0)
                return false;
        }
        return true;
    }
}
