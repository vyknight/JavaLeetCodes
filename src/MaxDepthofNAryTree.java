public class MaxDepthofNAryTree {
    public int maxDepth(Node root) {
        return findMaxDepth(root, 0);
    }

    public int findMaxDepth(Node root, int currDepth) {
        if (root == null) return currDepth;
        // find max depth of children
        int max = 1;
        for (Node child: root.children){
            int depth = findMaxDepth(child, currDepth + 1);
            if (depth > max) max = depth;
        }
        return max;
    }

    public int properSolution(Node root) {
        if (root == null) {return 0;}
        int height = 1;
        for (Node node: root.children){
            height = Math.max(height, 1 + maxDepth(node));
        }
        return height;
    }
}
