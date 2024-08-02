import java.util.*;
public class annagram {
    public static List<List<String>> groupAnnagram(String []str)
    {
        Map<String,List<String>>hmap=new HashMap<>();
        for(String s:str)
        {
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String canonical=new String(ch);
            if(hmap.containsKey(canonical))
            {
                hmap.get(canonical).add(s);
            }
            List<String>group=new ArrayList<>();
            group.add(s);
            hmap.put(canonical,group);
        }
        return new ArrayList<>(hmap.values());
    }
    public static void main(String []args)
    {
        System.out.println("1st set:");
        System.out.println(groupAnnagram(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println("2nd set:");
        System.out.println(groupAnnagram(new String[]{"abc","bca","cba","foo","ofo"}));

    }
}
