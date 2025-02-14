public class StringCompression {
    public static String compression(String str){
        int countConsecutive=0;
        StringBuilder compressed=new StringBuilder();
        if(str.length()==0){
            return "";
        }
        for(int i=0;i<str.length();i++){
            countConsecutive++;
             if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive=0;
            }


        }
        return compressed.length()<str.length()?compressed.toString():str;
    }
    public static void main(String[]args){
        String str="aabcccccaaa";
        System.out.println(compression(str));
    }
    
}
