import java.util.*;
class Graph
{
   private HashMap<String,List<String>>adjlist=new HashMap<>();
   public void print()
   {
    System.out.println(adjlist);
   }
   public boolean addVertex(String vertex)
   {
    if(adjlist.get(vertex)==null)
    {
        adjlist.put(vertex,new ArrayList<>());
        return true;

    }
    return false;
   }
   public boolean addEdge(String vertex1, String vertex2) {
    if (adjlist.get(vertex1) != null && adjlist.get(vertex2) != null) {
        adjlist.get(vertex1).add(vertex2);
        adjlist.get(vertex2).add(vertex1);
        return true;
    }
    return false;
}
public boolean removeEdge(String vertex1,String vertex2)
{
    if (adjlist.get(vertex1) != null && adjlist.get(vertex2) != null) {
        adjlist.get(vertex1).remove(vertex2);
        adjlist.get(vertex2).remove(vertex1);
        return true;
    }
    return false;

}
public boolean removeVertex(String vertex)
{
    if(adjlist.get(vertex)==null)return false;
    for(String othervertex:adjlist.get(vertex))
    {
        adjlist.get(othervertex).remove(vertex);
    }
    adjlist.remove(vertex);
    return true;
}
}


   

class main
{
    public static void main(String[]args)
    {
        Graph g=new Graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
      
        g.print();
        g.addEdge("A"," B");
        
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C","D");
        g.addEdge("A", "D");
        g.print();
        g.removeVertex("D");
        g.print();
        
    }
}
