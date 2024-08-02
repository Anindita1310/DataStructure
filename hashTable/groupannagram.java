import java.util.*;
public class groupannagram {
    public static List<List<String>> annagram(String[]string)
    {
        Map<String,List<String>>hmap=new HashMap<>();
        for(String s:string)
        {
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String canonical=new String(c);
            if(hmap.containsKey(canonical))
            {
                hmap.get(canonical).add(s);
            }
            else{
                List<String>group=new ArrayList<>();
                group.add(s);
                hmap.put(canonical,group);
            }
        }
        return new ArrayList<>(hmap.values());

    }
    public static void main(String[]args)
    {
        System.out.println("1st set:");
        System.out.println(annagram(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println("2nd set:");
        System.out.println(annagram(new String[]{"abc","bca","cba","foo","ofo"}));

    }
    
}
