//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
//  without disturbing the relative positions of the remaining characters. 
//  (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sPointer=0;
        int tPointer=0;
        while(tPointer<t.length()){
            if(sPointer<s.length()&&s.charAt(sPointer)==t.charAt(tPointer)){
                sPointer++;
            }
            tPointer++;
        }
        return sPointer==s.length();
    }
    public static void main(String[]args){
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
    }
    
}
