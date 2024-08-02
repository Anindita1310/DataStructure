import java.util.*;
public class maxstream {
    public static List<Integer>maxstreamIntegers(int nums[])
    {
      Heap maxHeap=new Heap();
      List<Integer>maxstream=new ArrayList<>();
      for(int num:nums)
      {
        maxHeap.insert(num);
        maxstream.add(maxHeap.getheap().get(0));
      }
      return maxstream;
    }
    public static void main(String[]args)
    {
        int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + maxstreamIntegers(nums1));
        System.out.println();

        int[] nums2 = {10, 2, 5, 1, 0, 11, 6};
        System.out.println("Test case 2:");
        System.out.println("Input: [10, 2, 5, 1, 0, 11, 6]");
        System.out.println("Expected output: [10, 10, 10, 10, 10, 11, 11]");
        System.out.println("Actual output: " + maxstreamIntegers(nums2));
        System.out.println();
    
    }
    
}
class Heap
{
    private List<Integer>heap;
    public Heap()
    {
        heap=new ArrayList<>();
    }
    public List<Integer> getheap()
    {
        return new ArrayList<>(heap);
    }
    private int leftchild(int index)
    {
        return 2*index+1;
    }
    private int rightchild(int index)
    {
        return 2*index+2;
    }
    private int parent(int index)
    {
        return (index-1)/2;

    }
    private void swap(int index1,int index2)
    {
        int temp=heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }
    public void insert(int value)
    {
       heap.add(value);
       int current=heap.size()-1;
       while(current>0&&heap.get(current)>heap.get(parent(current)))
       {
        swap(current,parent(current));
        current=parent(current);
       }
    }
    public Integer remove()
    {
        if(heap.size()==0)
        return null;
        if(heap.size()==1)
        {
            return heap.remove(0);
        }
        int maxValue=heap.get(0);
        heap.set(0,heap.remove(heap.size()-1));
        sinkDown(0);
        return maxValue;
    }
    private void sinkDown(int index) {
        int maxIndex=index;
        while(true)
        {
            int leftIndex=leftchild(index);
            int rightIndex=rightchild(index);
            if(leftIndex<heap.size()&&heap.get(leftIndex)>heap.get(maxIndex))
            {
                maxIndex=leftIndex;

            }
            if(rightIndex<heap.size()&&heap.get(rightIndex)>heap.get(maxIndex))
            {
                maxIndex=rightIndex;
                
            }
            if(maxIndex!=index)
            {
                swap(index,maxIndex);
                index=maxIndex;

            }
            else
            {
                return;
            }
        }
        
        
    }
}
