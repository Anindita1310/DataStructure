import java.util.*;
public class number {
    public static int findkthsmallest(int nums[],int k)
    {
        Heap maxHeap=new Heap();
        for(int num:nums)
        {
            maxHeap.insert(num);
            if(maxHeap.getheap().size()>k)
            {
                maxHeap.remove();
            }
        }
        return maxHeap.remove();
    }
    public static void main(String []args)
    {
        int nums[]={7,10,4,3,20,15};
        int k=3;
        System.out.println("kth smallest element is "+findkthsmallest(nums, k));
        int nums1[]={2,1,3,5,6,4};
        int k1=2;
        System.out.println("kth smallest element is "+findkthsmallest(nums1, k1));
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

