import java.util.*;
public class duplicate {
      static List<Integer> findduplicates(int nums[])
    {
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int num:nums)
        {
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        List<Integer>duplicate=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:hmap.entrySet())
        {
            if(entry.getValue()>1)
            {
                duplicate.add(entry.getKey());
            }
        }
        return  duplicate;

    }
    
    public static void main(String args[])
    {
        int a[]={1,2,3,3,4};
        List<Integer>l=findduplicates(a);
        System.out.println(l);
    }
}
