//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

//There is only one repeated number in nums, return this repeated number.

//You must solve the problem without modifying the array nums and using only constant extra space

//Example 1:

//Input: nums = [1,3,4,2,2]
//Output: 2
public class findDuplicates {
    public int findDuplicates(int []nums){
        int slow=nums[0];
        int fast=nums[0];
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast){
                break;
            }
        }
        int slow2=nums[0];
        while(slow!=slow2){
            slow=nums[slow];
            slow2=nums[slow2];
        }
        return slow;
    }
    public static void main(String[]args){
        findDuplicates f=new findDuplicates();
        int []nums={1,3,4,2,2};
        System.out.println(f.findDuplicates(nums));
        int []nums2={2,5,9,6,9,3,8,9,7,1};
        System.out.println(f.findDuplicates(nums2));
    }
    
}
