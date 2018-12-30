import java.util.LinkedList;
import java.util.Map;

public class BinaryTree {

    static Map<Integer, LinkedList<Integer>> map;

    public void getVerticalOrder(Node root, int hd) {
        
        if (root == null) {
            return; 
        }

        LinkedList<Integer> nodeList = map.get(hd);

        if (nodeList == NULL) {
            nodeList = new LinkedList<>();
            nodeList.add(root.val);
        }
        else {
            nodeList.add(root.val);
        }

        map.put(hd, nodeList);

        getVerticalOrder(root.left, hd+1);
        getVerticalOrder(root.left, hd-1);
    }

    static void printVerticalOrder(Node root) {
        map = new Map<Integer, LinkedList<Integer>>();
        int hd = 0;
        getVerticalOrder(root, hd, m);
        for (Entry<Integer, LinkedList<Integer>> entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}