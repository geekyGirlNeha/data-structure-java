public class ChackBST {

    //static int status=1;

    public static int isBST(Node root){

        int isLeft;
        int isRight;
        if(root==null){
            return 0;
        }
        if(root.lNode==null&&root.rNode==null){
            return 1;
        }
        else if (((root.lNode==null)||(root.lNode!=null &&
                root.lNode.key<root.key))
                &&
                (root.rNode==null||(root.rNode!=null
                        &&root.rNode.key>root.key))){
             isLeft=isBST(root.lNode);
             isRight=isBST(root.rNode);

        }else {
         return 0;
        }
        if(isLeft==1&&isRight==1){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(0);
        binaryTree.root.rNode = new Node(2);
        binaryTree.root.rNode.rNode = new Node(4);
        binaryTree.root.rNode.rNode.rNode = new Node(5);
        binaryTree.root.rNode.rNode.rNode.rNode = new Node(6);
        binaryTree.root.rNode.rNode.rNode.rNode.rNode = new Node(7);
        binaryTree.root.rNode.rNode.rNode.rNode.rNode.lNode = new Node(8);

        System.out.println(isBST(binaryTree.root));

    }
}
