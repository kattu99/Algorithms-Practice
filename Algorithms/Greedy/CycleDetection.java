/*Cycle Detection in Graphs*/


public class CycleDetection {


    int find(int parent[], int i) {

        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }

    void Union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    int isCycle(Graph graph) {

        int parent[] = new int[graph.V];
        for (int i=0; i<graph.V;i++) {
            parent[i] = -1;
        }

        for (int i=0; i<graph.E; i++) {
            int x = find(parent, x, graph.E[i].src);
            int y = find(parent, y, graph.E[i].dest);

            if (x == y) {
                return 1;
            }

            graph.Union(parent, x, y); 
        }
        return 0; 
    }




}