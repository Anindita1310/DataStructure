import java.util.*;
public class generateParentheses {
    public static List<String>generatePara(int n){
        List<String> res = new ArrayList<>();
        generate(res,"",0,0,n);
        return res;

    }

    private static void generate(List<String> res, String current, int open, int close, int max){
        if(current.length()==max*2){
            res.add(current);
            return;
        }
        if(open<max){
            generate(res,current+"(",open+1,close,max);
        }
        if(close<open){
            generate(res,current+")",open,close+1,max);
        }


    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(generatePara(n));
        int n1=1;
        System.out.println(generatePara(n1));
    }
    
}
