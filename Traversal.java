package BinaryTree;
import java.util.*;

class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data=data;
    }
}
public class Traversal {

    static Scanner sc=null;
    public static void main(String gg[])
    {
        sc= new Scanner(System.in);
        Node root=createTree();
        System.out.println("In order traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("Pre order traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("Post order traversal: ");
        postOrder(root);
        System.out.println();
    }
    static Node createTree()
    {
        Node root=null;
        System.out.print("Enter Data : ");
        int data =sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;
    }
    static void inOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root)
    {
        if(root==null) return;
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }
}