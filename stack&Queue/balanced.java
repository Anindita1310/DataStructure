import java.util.ArrayList;

 class Stack<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();  
    
    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
    
    public int size() {
        return stackList.size();
    }
    
    public void push(T value) {
        stackList.add(value);
    }
    
    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }
    
}
public class balanced {
    public static boolean isBalancedParentheses(String paranthesis)
    {
        Stack<Character>stack=new Stack<>();
        for(char c:paranthesis.toCharArray())
        {
            if(c=='('){
            stack.push(c);
            }
            else if(c==')')
            {
                if(stack.isEmpty()||stack.pop()!='(')
                return false;
            }
           
        }
        return stack.isEmpty();
    }
 
 
 
     public static void main(String[] args) {
         testAndPrint("()", true);
         testAndPrint("()()", true);
         testAndPrint("(())", true);
         testAndPrint("()()()", true);
         testAndPrint("(()())", true);
         testAndPrint(")()(", false);
         testAndPrint(")(", false);
         testAndPrint("(()", false);
         testAndPrint("))", false);
         testAndPrint("(", false);
         testAndPrint(")", false);
     }
     
     public static void testAndPrint(String testStr, boolean expected) {
         // Run the test and store the result
         boolean result = isBalancedParentheses(testStr);
         
         // Print the test string, expected result, and actual result
         System.out.println("Test String: " + testStr);
         System.out.println("EXPECTED: " + expected);
         System.out.println("RESULT: " + result);
         
         // Check if the test passed or failed
         if (result == expected) {
             System.out.println("STATUS: PASS");
         } else {
             System.out.println("STATUS: FAIL");
         }
         
         // Print a separator for better readability
         System.out.println("--------------");
     }
 
 }
 
