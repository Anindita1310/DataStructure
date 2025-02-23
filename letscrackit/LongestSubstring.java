//Given a string s, find the length of the longest 
//substring
 //without repeating characters.

 

//Example 1:

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

import java.util.*;
public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
    }
    public static void main(String[] args){
        longestSubstring obj=new longestSubstring();
        String s="abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
    
}
