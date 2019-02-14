import java.util.ArrayList;

public class LeftViewTree {


    public static ArrayList<Integer> printLeftView(Node current,ArrayList<Integer> lView){

        if (current==null)
            return lView;
        if(current.lNode!=null){
            lView.add(current.lNode.key);
        }
        printLeftView(current.lNode,lView);
        printLeftView(current.rNode,lView);

        return lView;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.lNode = new Node(8);
        binaryTree.root.rNode = new Node(2);
        binaryTree.root.lNode.lNode = new Node(3);
        binaryTree.root.lNode.rNode = new Node(5);
        binaryTree.root.rNode.rNode = new Node(2);
        binaryTree.root.rNode.lNode = new Node(6);

        ArrayList<Integer> leftView=new ArrayList<>();
        leftView.add(binaryTree.root.key);
        System.out.println(printLeftView(binaryTree.root,leftView));
    }
}
