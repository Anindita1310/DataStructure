//code for enqueue and dequeue operation using two stack objects//
import java.util.Stack;
public class main1 {
    public static void main(String[]args){
    MyQueue q=new MyQueue();
    q.enqueue(1);
    q.enqueue(3);
    q.enqueue(4);
    System.out.println("dequeued value is "+q.dequeue());
   
    System.out.println("dequeued value is "+q.dequeue());
    System.out.println(q.peek());
    System.out.println(q.isEmpty());
    }

}
class MyQueue
{
    private Stack<Integer>stack1=new Stack<>();
    private Stack<Integer>stack2=new Stack<>();
    public void enqueue(int value)
    {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
    public Integer dequeue()
    {
        if(isEmpty())
        return null;
        return stack1.pop();
    }
    public boolean isEmpty()
    {
        return stack1.isEmpty();
    }
    public int peek()
    {
        return stack1.peek();
    }
}
