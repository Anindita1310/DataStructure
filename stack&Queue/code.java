
import java.io.*;
import java.util.*;

class MyQueue{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    
    public void enqueue(int data){
        s1.push(data);
    }
    public void dequeue(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }
    public int peek(){
        if(s2.isEmpty()){
        while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
}
public class code {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        MyQueue queue=new MyQueue();
        int q=sc.nextInt();

        while (q>0) {
            int op=sc.nextInt();
            if(op==1){
                queue.enqueue(sc.nextInt());
            }
            else if(op==2){
                queue.dequeue();
            }
            else{
                System.out.println(queue.peek());
            }
            q--;
            
        }
        
    }
}
