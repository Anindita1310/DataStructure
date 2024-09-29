import java.util.*;
public class twoSum {
    public static int[]twoSum(int nums[],int target){
        HashMap<Integer,Integer>hmap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int complement=target-num;
            if(hmap.containsKey(complement)){
                return new int[]{hmap.get(complement),i };
                
            }
            hmap.put(num, i);

        }
        return new int[]{};

    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    
}
