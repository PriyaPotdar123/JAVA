package Datastructure;
import java.util.*;

class Graphh
{
	   static int V = 5;
       static ArrayList<ArrayList<Integer> > adj
                   = new ArrayList<ArrayList<Integer> >(V);
       
    static void addEdge( int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
 
    static void printGraph()
    {
        for (int i = 0; i < adj.size(); i++) {
            
            System.out.print(i);
            
            for (int j = 0; j < adj.get(i).size(); j++) 
            {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args)
    {
    
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
 
        
        addEdge(0, 1);
        addEdge(0, 4);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 3);
        addEdge(3, 4);
         
        printGraph();
    }
}