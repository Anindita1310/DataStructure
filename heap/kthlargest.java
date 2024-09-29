import java.util.*;
public class kthlargestelement {
    public int findKthLargestElement(int nums[],int k){
        PriorityQueue<Integer>heap=new PriorityQueue<>();
        for(int num:nums){
            heap.add(num);
            if(heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }
    public static void main(String[] args) {
        kthlargestelement obj=new kthlargestelement();
        int nums[]={3,2,1,5,6,4};
        int k=2;
        System.out.println("Kth largest element is "+obj.findKthLargestElement(nums,k));
        
    }

    
}
