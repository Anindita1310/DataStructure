import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
class uniquebinary2{
    public int numTrees(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        uniquebinary2 sol=new uniquebinary2();
        int n;
        System.out.println("Enter the value");
        n=in.nextInt();
        int numTrees=sol.numTrees(n);
        System.out.println("The no of unique bst that can be formed "+"is "+numTrees);

    }
}
