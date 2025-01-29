//Given an integer array nums, handle multiple queries of the following type:

//Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
//Implement the NumArray class:

//NumArray(int[] nums) Initializes the object with the integer array nums.
//int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 class NumArray {
    private int myarray[]={};

    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        this.myarray=nums;
        
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return myarray[right];
        }
        return (myarray[right]-myarray[left-1]);
        
    }
}
