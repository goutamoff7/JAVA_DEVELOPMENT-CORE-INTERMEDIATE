//BINARY SEARCH TREE
package graph;
import java.util.Scanner;
class BinarySearchTree
{
    class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    } 

    Node root=null;

    Node create(int data)
    {
        return new Node(data);
    }

    Node insert(Node root,int data)
    {
        if(root==null)
            return create(data);
        else
        {
            if(data<=root.data)
                root.left=insert(root.left,data);
            else if(data>root.data)
                root.right=insert(root.right,data);
            return root;
        }
    }

    void preOrder(Node root)
    {
        if(root!=null)
        {
        System.out.print(root.data+" ");
        preOrder(root.left);        
        preOrder(root.right);
        }
    }

    void inOrder(Node root)
    {
        if(root!=null)
        {
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
        }
    }

    void postOrder(Node root)
    {   if(root!=null)
        {     
        postOrder(root.left);        
        postOrder(root.right);
        System.out.print(root.data+" ");
        }
    }

    void insertFromArray(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			if(root==null)
				root=create(ar[i]);
			else
			{
				insert(root,ar[i]);
			}
		}
		System.out.print("\nInserting Data in the BST from an Array has been successfully done");
	}
    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner read = new Scanner(System.in);
		while (true) 
        {
			System.out.println("\nPress 1 for Insert Data");
			System.out.println("Press 2 for Pre-Order Traversal");
			System.out.println("Press 3 for In-Order Traversal");
			System.out.println("Press 4 for Post-Order Traversal");
			System.out.println("Press 6 for exit");
			System.out.print("Enter your choice:");
			int ch = read.nextInt();
			switch (ch)
            {
				case 1:
                    System.out.println("Enter the Number");
                    int data=read.nextInt();
					tree.root=tree.insert(tree.root,data);
					break;
				case 2:
					tree.preOrder(tree.root);
					break;
				case 3:
					tree.inOrder(tree.root);
					break;
				case 4:
					tree.postOrder(tree.root);
					break;
                case 5:
					System.out.println("Enter the Size of array");
					int size=read.nextInt();
					int ar[]=new int[size];
					System.out.println("Enter "+size+" Element into the array");
					for(int i=0;i<size;i++)
						ar[i]=read.nextInt();
					tree.insertFromArray(ar);
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("Enter correct choice");
            }
        }
    }    
}

