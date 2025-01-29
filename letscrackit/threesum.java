//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

 

//Example 1:

//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
import java.util.*;
class ThreeSum{
    public List<List<Integer>> findSum(int nums[]){
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        int i,j,k;
        for( i=0;i<nums.length-1;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                
                  while(j<k &&nums[j]==nums[j+1]){
                    j++;
                   }
                  while(j<k &&nums[k]==nums[k-1]){
                    k--;
                  }
                  j++;
                  k--;
                }
                else if(sum<0){
                j++;
                }
                else{
                k--;
                }
            }
        }
        return result;

    }
    public static void main(String[] args){
        ThreeSum obj=new ThreeSum();
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> result=obj.findSum(nums);
        for(List<Integer> list:result){
            System.out.println(list);
        }
    }


}
