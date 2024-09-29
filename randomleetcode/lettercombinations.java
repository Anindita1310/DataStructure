import java.util.*;
public class lettercombinations{
    Map<Character,String>phoneMap=new HashMap<>(){{
   
    put('2',"abc");
    put('3',"def");
    put('4',"ghi");
    put('5',"jkl");
    put('6',"mno");
    put('7',"pqrs");
    put('8',"tuv");
    put('9',"wxyz");


    }};
   

    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            return new ArrayList<>();
        }
        List<String>result=new ArrayList<>();
        backtrack(result,"",digits);
        return result;
    }
    private void backtrack(List<String>result,String current,String remaining){
        if(remaining.length()==0){
            result.add(current);
            return ;
        }
        String letters=phoneMap.get(remaining.charAt(0));
        for(char ch:letters.toCharArray()){
            backtrack(result,current+ch,remaining.substring(1));
        }
    }
    public static void main(String[] args) {
        lettercombinations l = new lettercombinations();
        String digits="23";
        List<String>newResult=new ArrayList<>();
        newResult=l.letterCombinations(digits);
        System.out.println(newResult);
    }
}
