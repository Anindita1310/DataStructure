public class URLify {
    public static String URLify(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String str="Mr John Smith";
        System.out.println(URLify(str));
    }
        
    
    
}
