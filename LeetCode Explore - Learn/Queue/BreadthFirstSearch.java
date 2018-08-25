//Breadth First Search 
/*
Breadth First Search is an algorithm to traverse or search in data structures like a tree or a graph. You can use the BFS to perform a level-order traversal
in a tree. You can use BFS to traverse a graph. You can use a BFS to find the shortest path, from start node to target node. 


1. What is the processing order of the nodes? 

In the first round, we process the root node. In the second round we process the nodes next to the root node. In the third round, we process nodes two steps 
from the root node; so on and so forth. The nodes closer to the root node will be traversed earlier. If node X is added to queue in kth round, the shortest path 
between root node and X is exactly k. 

2. What about the enqueue and dequeue order of the queue? 

You first enqueue the root node. Then process nodes in the queue one by one, and add all the neighbors to the queue. It is worth noting that the newly-added nodes
will not be traversed immediately. The processing of the nodes is in the exact same order as how they were added to the queue which is first in, first out. 

Previously we introduced two main scenarios of BFS: do traversal or find the shortest path. Typically, it happens in a tree or graph. 

TEMPLATES FOR BFS:

Template 1: 
 */
public class BreadthFirstSearch { 
int BFS(Node root, Node target) {
    Queue<Node> queue;  // store all nodes which are waiting to be processed
    int step = 0;       // number of steps neeeded from root to current node
    // initialize
    add root to queue;
    // BFS
    while (queue is not empty) {
        step = step + 1;
        // iterate the nodes which are already in the queue
        int size = queue.size();
        for (int i = 0; i < size; ++i) {
            Node cur = the first node in queue;
            return step if cur is target;
            for (Node next : the neighbors of cur) {
                add next to queue;
            }
            remove the first node from queue;
        }
    }
    return -1;          // there is no path from root to target
}

/*
1. The nodes in the queue are the nodes waiting to be processed. 
2. After each outer while loop, we are one step further away from the root node. The variable ste indicates the distance from the root node. 

Template 2: 

Sometimes, it is important to make sure that we never visit a node twice. You add a hash set to the code to solve the problem. 
*/


/**
 * Return the length of the shortest path between root and target node.
 */
int BFS(Node root, Node target) {
    Queue<Node> queue;  // store all nodes which are waiting to be processed
    Set<Node> used;     // store all the used nodes
    int step = 0;       // number of steps neeeded from root to current node
    // initialize
    add root to queue;
    add root to used;
    // BFS
    while (queue is not empty) {
        step = step + 1;
        // iterate the nodes which are already in the queue
        int size = queue.size();
        for (int i = 0; i < size; ++i) {
            Node cur = the first node in queue;
            return step if cur is target;
            for (Node next : the neighbors of cur) {
                if (next is not in used) {
                    add next to queue;
                    add next to used;
                }
            }
            remove the first node from queue;
        }
    }
    return -1;          // there is no path from root to target
}

}