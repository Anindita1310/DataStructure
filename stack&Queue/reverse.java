package stack;


import java.util.*;
public class reverse {
    public static void main(String[]args)
    {
        String str="ram";
        System.out.println("Original string :"+str);
        String rev=reverseString(str);
        System.out.println("Reverse string   :"+rev);

    }
    public static String reverseString(String string)
    {
        Stack<Character>stack=new Stack<>();
        String reverse="";
        for(char c:string.toCharArray())
        {
            stack.push(c);
        }
        while(!stack.isEmpty())
        {
            reverse+=stack.pop();
        }
        return reverse;
    }
    
}
class Stack<T>
{
    private ArrayList<T> stackList=new ArrayList<>();
    public ArrayList<T> getstack()
    {
        return stackList;
    }
    public void print()
    {
        for(int i=stackList.size()-1;i>=0;i--)
        {
            System.out.println(stackList.get(i));
        }
    }
    public boolean isEmpty()
    {
        return stackList.size()==0;
    }
    public int getsize()
    {
        return stackList.size()-1;
    }
    public void push(T value)
    {
        stackList.add(value);
    }
    public T pop()
    {
        if(isEmpty())
        return null;
        return stackList.remove(stackList.size()-1);
    }
    public T peek()
    {
        if(isEmpty())
        return null;
        return stackList.get(stackList.size()-1);
    }
}

