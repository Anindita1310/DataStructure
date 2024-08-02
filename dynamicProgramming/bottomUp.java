public class bottoumup {
    static int counter=0;
    public static int fiblist(int n)
    {
        int list[]=new int[n+1];
        list[0]=0;
        list[1]=1;
        for(int i=2;i<=n;i++)
        {
            counter++;
            list[i]=list[i-1]+list[i-2];
        }
        return list[n];
    }
    public static void main(String args[])
    {
        int n=40;
        System.out.println(fiblist(n)+" ");
        System.out.println(counter+" no.of iterations ");

    }
    
}
