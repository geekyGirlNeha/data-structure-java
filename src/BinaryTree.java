import java.util.List;

public class BinaryTree {

    Node root;
    public static int max_level=0;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int key) {
        root = new Node(key);
    }

    public void inOrder(Node current) {
        if (current == null) {
            return;
        }
        inOrder(current.left);
        System.out.println(current.data);
        inOrder(current.right);
    }

    public void preOrder(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.data);
        preOrder(current.left);
        preOrder(current.right);
    }

    public static void printLeftView(Node root){


        printLeftViewUtil(root,1);
    }

    public static void printLeftViewUtil(Node current,int level){

        if(current==null){
            return;
        }

        if(max_level<level){
            System.out.println(current.data+" ");
            max_level=level;
        }

        printLeftViewUtil(current.left,level+1);
        printLeftViewUtil(current.right,level+1);
    }


    public void allPaths(Node current, List<Integer> paths) {

        //check for null
        if (current == null) {
            return;
        }

        paths.add(current.data);

        //If leaf node print the path
        if (current.right == null & current.left == null) {

            System.out.println(paths);
            paths.remove(paths.size() - 1);
        } else {
            allPaths(current.left, paths);
            allPaths(current.right, paths);
        }


    }


    public static void printAtGivenLevel(Node current,int level){

        if (current==null){
            return;
        }

        if(level==1){
            System.out.println(current.data);
        }

        if (level>1){
            printAtGivenLevel(current.left,level-1);
            printAtGivenLevel(current.right,level-1);
        }

    }

    /*public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.lNode = new Node(8);
        binaryTree.root.rNode = new Node(2);
        binaryTree.root.lNode.lNode = new Node(3);
        binaryTree.root.lNode.rNode = new Node(5);
        binaryTree.root.rNode.rNode = new Node(2);


        List<Integer> paths = new ArrayList<Integer>();
        binaryTree.allPaths(binaryTree.root, paths);

        printAtGivenLevel(binaryTree.root,4);


    }*/
}
