import java.util.*;
public class firstnonrepeating {
    public static Character repeating(String s){
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(hmap.get(ch1)==1){
                return ch1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(repeating("aabbc"));
        System.out.println(repeating("Leetcode")); 

    }
    
}
