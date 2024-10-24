public class kthfactorofn {
    public  int kthfactor(int n,int k){
        int count=0;
        int nums[]=new int[n];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                nums[count]=i;
                count++;
            }
                

        }
        if(k>count){
            return -1;
        }else{
            return nums[k-1];
        }
    }
    public static void main(String[] args) {
        kthfactorofn obj=new kthfactorofn();
        System.out.println(obj.kthfactor(12,3));
        System.out.println(obj.kthfactor(4,4));

    }
    
}
