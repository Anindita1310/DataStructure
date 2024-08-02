import java.util.*;
public class program {
    public static boolean isCommom(int[] array1,int[] array2)
    {
        HashMap<Integer,Boolean> hmap=new HashMap<>();
        for(int i:array1)
        {
            hmap.put(i,true);
        }
        for(int j:array2)
        {
            if(hmap.containsKey(j))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
       int []arr1={1,4,9};
       int[]arr2={2,5,6};
       System.out.println(isCommom(arr1, arr2));
    }

        
    }
    

