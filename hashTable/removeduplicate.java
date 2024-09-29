import java.util.*;
public class removeDuplicate {
    public static List<Integer>removedup(List<Integer>myList){
        Set<Integer>uniqueSet=new HashSet<>(myList);
        return new ArrayList<>(uniqueSet);
    }
     public static void main(String[] args) {
       List<Integer>myList=List.of(2,3,4,3,1,1,6,7,8,8);
       List<Integer>result=removedup(myList);
       System.out.println(result);
     }
     
    
}
