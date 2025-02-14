import java.util.*;
public class hasUnique {
    public static boolean hasUnique(String str){
        Set<Integer>set=new HashSet<>();
        for(int i:str.toCharArray()){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;   
    }
    public static void main(String[]args){
        String str="hello";
        System.out.println(hasUnique(str));
    }
}
