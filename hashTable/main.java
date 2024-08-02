import java.util.*;
class HashTable
{
     int size=7;
      Node datamap[];
    class Node
    {
         String key;
         int value;
         Node next;
         public Node(String key,int value)
         {
            this.key=key;
            this.value=value;
            this.next=null;
         }

    }
    public HashTable()
    {
        datamap=new Node[size];
    }
    public void printhashtable()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(i+" :");
            Node temp=datamap[i];
            while(temp!=null)
            {
                System.out.println(temp.key+" "+temp.value);
                temp=temp.next;
            }
            
        }
    }
    public int hash(String key)
    {
        int hash=0;
        char[]keyArray=key.toCharArray();
        for(int i=0;i<keyArray.length;i++)
        {
            int ascii=keyArray[i];
            hash=(hash+ascii*23)%datamap.length;
        }
        return hash;
    }
    public void set(String key,int value)
    {
        int index=hash(key);
        Node newNode=new Node(key,value);
        if(datamap[index]==null)
        {
            datamap[index]=newNode;
        }
        else{
            Node temp=datamap[index];
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp=newNode;
        }

    }
    public int get(String key)
    {
        int index=hash(key);
        Node temp=datamap[index];
        while(temp!=null)
        {
            if(temp.key==key)return temp.value;
            {
              temp=temp.next;
            }
            
        }
        return 0;
    }
    public ArrayList keys()
    {
        ArrayList<String>allkeys=new ArrayList<>();
        for(int i=0;i<datamap.length;i++)
        {
            Node temp=datamap[i];
            while(temp!=null)
            {
                allkeys.add(temp.key);
                temp=temp.next;
            }
        }
        return allkeys;
    }
}
class main
{
    public static void main(String args[])
    {
        HashTable table=new HashTable();
        table.set("apple",200);
        table.set("banana",400);
        table.set("grapes",500);
        table.set("cherry",350);
        table.printhashtable();
        System.out.println();

        System.out.println(table.get("banana"));
        System.out.println( table.get("bolts"));
        System.out.println(table.keys());

    }
}
