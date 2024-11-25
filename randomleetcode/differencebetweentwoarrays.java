import java.util.*;
public class difference {
    public static List<List<Integer>> findDifference(int nums1[],int nums2[]){
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for (int num:nums1){
            s1.add(num);
        }
        for (int num1:nums2){
            s2.add(num1);
        }
        Set<Integer>s3=new HashSet<>(s1);
        s3.removeAll(s2);
        Set<Integer>s4=new HashSet<>(s2);
        s4.removeAll(s1);

        List<List <Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>(s3));
        result.add(new ArrayList<>(s4));
        return result;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={2,4,6};
        List<List<Integer>>result=new ArrayList<>();
        result=findDifference(nums1, nums2);
        System.out.println(result);

    }
    
}
