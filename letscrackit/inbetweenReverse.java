//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
//Example 1:
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class inbetweenReverse{
    public static Node reverseBetween(Node head, int m, int n) {
        if (head == null || m == n) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev=dummy;
        for(int i=0;i<m-1;i++){
            prev=prev.next;
        }
        Node curr=prev.next;
        for(int i=0;i<n-m;i++){
            Node temp=curr.next;
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;

        }
        return dummy.next;
    }
    public static void main(String[]args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node reversed=reverseBetween(head,2,4);
        while(reversed!=null){
            System.out.print(reversed.val+",");
            reversed=reversed.next;
        }
    }
}
