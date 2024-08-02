import java.util.Arrays;

public class program {
    public static int[]findMaxMin(int list[])
    {
        int max=list[0];
        int min=list[0];
        for(int i=0;i<list.length;i++)
        {
            if(list[i]>max)
            {
                max=list[i];
            }
            else if (list[i]<min) {
                min=list[i];
                
            }
        }
        return new int[]{max,min};
    }
    public static void main(String[]args)
    {
        int nums[]={1,4,9,8,7,6};
        int []result=findMaxMin(nums);
        System.out.println(result[0]+" "+result[1]);
         int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

    }
    
}
