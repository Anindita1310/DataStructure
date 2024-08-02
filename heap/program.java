import java.util.*;
public class program {
    public static void main(String []args)
    {
        graph g1=new graph();
        g1.insert(95);
        g1.insert(75);
        g1.insert(80);
        g1.insert(55);
        g1.insert(60);
        g1.insert(50);
        g1.insert(65);
        System.out.println(g1.getheap());
        g1.remove();
        System.out.println(g1.getheap());
        g1.remove();
        System.out.println(g1.getheap());
    }
    
}
class graph
{
    private List<Integer>heap1;
    public graph()
    {
        heap1=new ArrayList<>();
    }
    public List<Integer>getheap()
    {
        return new ArrayList<>(heap1);
    }
    private int leftChild(int index)
    {
        return 2*index+1;
    }

     private int rightChild(int index)
    {
    return 2*index+2;
    }
    private int parent(int index)
    {
        return(index-1)/2;
    }
    private void swap(int index1,int index2)
    {
        int temp=heap1.get(index1);
        heap1.set(index1,heap1.get(index2));
        heap1.set(index2,temp);
    }
    public void insert(int value)
    {
        heap1.add(value);
        int current=heap1.size()-1;
        while(current>0&&heap1.get(current)<heap1.get(parent(current)))
        {
           swap(current,parent(current));
           current=parent(current);
        }
    }
    public Integer remove()
    {
        if(heap1.size()==0)
        {
            return null;
        }
        if(heap1.size()==1)
        {
            return heap1.remove(0);
        }
        int maxvalue=heap1.get(0);
        heap1.set(0,heap1.remove(heap1.size()-1));
        sinkDown(0);
        return maxvalue;


    }
    private void sinkDown(int index) {
        int maxIndex=index;
        while(true)
        {
            int left=leftChild(index);
            int right=rightChild(index);
            if(left<heap1.size()&&heap1.get(left)<heap1.get(maxIndex))
            {
                maxIndex=left;
            }
            if(right<heap1.size()&&heap1.get(right)<heap1.get(maxIndex))
            {
                maxIndex=right;
            }
            if(maxIndex!=index)
            {
                swap(index,maxIndex);
                index=maxIndex;
            }
            
            return ;
        }
        
    }


}
