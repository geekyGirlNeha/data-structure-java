public class HeightOfTree {


    public static int height(Node current) {

        if (current == null) {
            return 0;
        }

        int lHeight = height(current.lNode);
        int rHeight = height(current.rNode);

        if (lHeight > rHeight) {
            return lHeight + 1;
        } else {
            return rHeight + 1;
        }
    }


    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.lNode = new Node(8);
        binaryTree.root.rNode = new Node(2);
        binaryTree.root.lNode.lNode = new Node(3);
        binaryTree.root.lNode.rNode = new Node(5);
        binaryTree.root.rNode.rNode = new Node(2);

        System.out.println(height(binaryTree.root));

    }
}
