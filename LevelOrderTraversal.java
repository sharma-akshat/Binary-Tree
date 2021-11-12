package BinaryTree;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}

class LevelOrderTraversal{
    static Scanner sc=null;

    public static boolean printLevels(TreeNode root, int level){
        if(root==null){
            return false;
        }
        if(level==1){
            System.out.print(root.data+" ");
            return true;
        }
        boolean left=printLevels(root.left, level-1);
        boolean right=printLevels(root.right, level-1);

        return left || right;
    }

    public static void levelOrderTraversal(TreeNode root){
        int level=1;
        while(printLevels(root, level)){
            level++;
        }
    }
    public static void main(String gg[]){
        sc=new Scanner(System.in);  
        TreeNode root=new TreeNode(15);
        root.left=new TreeNode(20);
        root.right=new TreeNode(33);
        root.left.left=new TreeNode(41);
        root.left.right=new TreeNode(55);
        root.right.left=new TreeNode(96);
        root.right.right=new TreeNode(17);
        root.left.left.left=new TreeNode(80);
        root.left.right.left=new TreeNode(89);
        root.right.left.right=new TreeNode(100);
        root.right.right.right=new TreeNode(121);

        levelOrderTraversal(root);
    }
}