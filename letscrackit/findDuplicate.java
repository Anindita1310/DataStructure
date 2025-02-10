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
