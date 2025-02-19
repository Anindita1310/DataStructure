//Assume you have a method isSubstring which checks if one word is a substring of another.Given two strings s1 and s2 write a code to check if s2 is a rotation of s1 using only
//one call to isSubstring



public class StringRotation {
    public static boolean isRotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String s1s1=s1+s1;
        return isSubstring(s1s1,s2);
    }
    public static boolean isSubstring(String s1,String s2){
        return s1.contains(s2);
    }
    public static void main(String[]args){
        String s1="waterbottle";
        String s2="erbottlewat";
        System.out.println(isRotation(s1,s2));
    }
    
}
