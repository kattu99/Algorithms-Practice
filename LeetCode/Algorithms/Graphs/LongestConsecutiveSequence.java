public class Tree {

    public void longestConsecutiveUtil(Node root, int curLength, int expected) {
        if (root == null) {
            return;
        }

        //compare nodes value to its parents value and if its one more then you update the longest
        //common path using the previous values, pass node.data + 1 and the current length (0 or previous one + 1)
        //to next method
        if (root.data == expected) {
            curLength++;
        }
        else {
            curLength = 1; 
        }

        res = max(res, curLength);

        longestConsecutiveUtil(root.left, curLength, root.data + 1);
        longestConsecutiveUtil(root.right, curLength, root.data + 1);
    }
} 