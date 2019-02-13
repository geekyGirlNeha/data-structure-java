public class SpiralLevelOrder {


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

    public static void printAtLevel(Node current,int level,boolean ltr){

        if (current==null){
            return;
        }
        if (level==1){
            System.out.println(current.key);
        }

        if (ltr){
            printAtLevel(current.lNode,level-1,ltr);
            printAtLevel(current.rNode,level-1,ltr);
        }else {
            printAtLevel(current.rNode,level-1,ltr);
            printAtLevel(current.lNode,level-1,ltr);
        }
    }

    public static void printSpiralLevel(Node root){

        int height=height(root);
        boolean ltr=false;

        for(int i=1;i<=height;i++){
            printAtLevel(root,i,ltr);
            ltr=!ltr;
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

        printSpiralLevel(binaryTree.root);
    }
}
