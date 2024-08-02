public class main2 {
    public static String findlongestString(String[]strlist)
    {
        String longest="";
        for(String str:strlist)
        {
            if(str.length()>longest.length())
            {
                longest=str;
            }
        }
        return longest;
    }
    public static void  main(String[]args)
    {
        String[]strList={"hello","hey","hi there","hi"};
        String result=findlongestString(strList);
        System.out.println(result);
    }
    
}
