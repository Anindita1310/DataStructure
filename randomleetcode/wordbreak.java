import java.util.*;
public class wordbreak {
    public boolean wordbreakage(String s,List<String>worddict){
        Set<String>hashSet=new HashSet<>(worddict);
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&hashSet.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
    public static void main(String[]args){
        wordbreak obj=new wordbreak();
        String s="leetcode";
        List<String>wordDict=new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(obj.wordbreakage(s,wordDict));


    }
    
}
