package BinaryTree;
import java.util.*;

class BinaryNode{
    int data;
    BinaryNode left, right;
    public BinaryNode(int data){
        this.data=data;
    }
}
public class IdenticalTrees {

    public static boolean isIdentical(BinaryNode x, BinaryNode y){
        if(x==null && y==null) return true;
        if((x!=null && y!=null) && (x.data == y.data) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right))
        {
            return true;
        }
        else return false;
    }
    static Scanner sc=null;
    public static void main(String gg[]){
        sc=new Scanner(System.in);
        BinaryNode x=new BinaryNode(5);
        x.left=new BinaryNode(6);
        x.right=new BinaryNode(7);
        x.left.left=new BinaryNode(40);
        x.left.right=new BinaryNode(3);

        BinaryNode y=new BinaryNode(5);
        y.left=new BinaryNode(6);
        y.right=new BinaryNode(7);
        y.left.left=new BinaryNode(40);
        y.left.right=new BinaryNode(3);

        if(isIdentical(x,y)) System.out.println("Both the binary trees are identical");
        else System.out.println("The two binary trees are not identical");
    }
}
