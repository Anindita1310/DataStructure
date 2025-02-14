public class PalindromePermutation {
    public static boolean palindromePermutation(String str){
        int[] arr = new int[128];
        str = str.toLowerCase().replaceAll("\\s", ""); // ignore case sensitivity and whitespace characters
        for(int i : str.toCharArray()){
            arr[i]++;
        }
        int count = 0;
        for(int i : arr){
            if(i % 2 != 0){
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args){
        String str = "tact coa";
        System.out.println(palindromePermutation(str));
    }
}
