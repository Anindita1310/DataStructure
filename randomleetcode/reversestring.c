//Given an input string s, reverse the order of the words.

//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

//Return a string of the words in reverse order concatenated by a single space.
public class reverseWords {
    public String reverseWords(String s){
        String s1="";
        String s2="";
        s=s.trim()+" ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch != ' '){
                s1=s1+ch;
            } else{

                if (!s1.isEmpty()) {  
                    s2 = s1 + " " + s2; 
                    s1 = ""; 
                }
            }
        }
        return s2.trim();
    }
    public static void main(String []args){
        reverseWords r=new reverseWords();
        String s2=r.reverseWords("Hello World");
        System.out.println(s2);
    }
    
}
