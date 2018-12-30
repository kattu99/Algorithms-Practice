public class BinaryTree {

    HashMap<Integer, Pair> map; 

    class Pair {
        int height;
        int value; 

        Pair(int x, int y) {
            this.height = x;
            this.value = y; 
        }
    }

    class Node {

        int data;

        Node left, right;

        Node(int key) {
            data = key;
            hd = INT_MAX;
            left = right = NULL;
        }   
    }

    void printBottomViewUtil(Node root, int level, int currDist) {
        if (root == null) {
            return;
        }

        Pair pair = (Pair) map.get(currDist);

        if (pair != NULL) {

            if (level > pair.height) {
                Pair newPair = new Pair(level, root.val);

                map.put(currDist, newPair);
            }
            //do nothing when pair != NULL and pair exists at higher level
        }
        else {
            Pair newPair = new Pair(level, root.val);
            map.put(currDist, newPair);
        }
    }

    void printBottomView() {
        printBottomViewUtil();
        
        //To loop over a map, create an entrySet and iterate over it 
        Iterator<Entry<Integer, Pair>> iterator = map.entrySet().iterator();

        //while it has next bring value out as entry, getValue and access objects inner variables 
        while (iterator.hasNext()) {
            Entry<Integer, Pair> nodeEntry = iterator.next();
            System.out.print(" " + nodeEntry.getValue().value);
        }
    }

}