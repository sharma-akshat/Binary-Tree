package BinaryTree;
import java.util.*;

public class Height {
    static Scanner sc=null;

    public static void main(String gg[])
    {
        sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        root.right.left.right = new Node(9);
        

        int height = calculateHeight(root);
        System.out.println("Height of the tree is "+height);
    }

    public static int calculateHeight(Node root)
    {
        if(root == null){
            return 0;
        }

        //creating an empty queue and enqueing root node in it
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        Node front=null;
        int height = 0;
        while(!queue.isEmpty()){
            
            int size = queue.size(); // total number of nodes at current level

            //processing each node and enqueing non empty left and right child
            while(size-- > 0){
                front = queue.poll();
                if(front.left != null){
                    queue.add(front.left);
                }
                if(front.right != null){
                    queue.add(front.right);
                }
            }
            height++; //increasing height for each level
        }
        return height;
    }
}
