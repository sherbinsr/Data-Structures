import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
 
	private static TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public  TreeNode(int data) 
		{
			this.data=data;
		}
	
	}
	public void CreateBinaryTree() 
	{
		TreeNode first= new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
	}
	public void  PreOrder(TreeNode root) 
	{
		if(root==null) 
		{
			return;
		}
		System.out.println(root.data+" ");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	public void IterativePreOrder() 
	{
		if(root==null) 
		{
			return;
		}
		Stack <TreeNode>stack = new Stack<>();
		
		stack.push(root);
		while(!stack.isEmpty()) 
		{
			TreeNode temp = stack.pop();
			System.out.print(temp.data);
			if(temp.right!=null) 
			{
				stack.push(temp.right);
			}
			if(temp.left!=null) 
			{
				stack.push(temp.left);
			}
		}
		
	}
	public int countNodes(TreeNode root) {


		if (root == null)
			return 0;
		else
			return 1 + countNodes(root.left) + countNodes(root.right);

	}
	public void Inorder(TreeNode root) 
	{
		if(root == null) 
		{
			return;
		}
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);
	}

	List<Integer>li = new ArrayList<>();
	public List<Integer> postorderTraversal(TreeNode root) {

		postorder(root);
		return li;
	}
	public void postorder(TreeNode root) 
	{

		if(root == null) 
		{
			return;
		}
		Inorder(root.left);
		Inorder(root.right);
		li.add(root.data);
	}
	public int findmax(TreeNode root) 
	{
		if(root ==null)
		{
			return Integer.MIN_VALUE;
		}
		int result =root.data;
		int left =findmax(root.left);
		int right =findmax(root.right);
		if(left>result) 
		{
			result=left;
		}
		if(right>result) 
		{
			result=right;
		}
		return result;	
	}
	public void iterativeinorder(TreeNode root) 
	{
		Stack<TreeNode>stack = new Stack<>();
		TreeNode  temp =root;
		while(!stack.isEmpty() ||temp!=null) {
		
			if(temp!=null) 
			{
			//	stack = push(temp);
				temp =temp.left;
				
			}
			else 
			{
				temp =stack.pop();
				System.out.println(temp.data);
	      		temp=temp.right;
			}
		}
		
	}

	int k;
	int result=0;
	public int kthSmallest(TreeNode root, int k) {

		this.k=k;
		inorder(root);
		return result;

	}
	 public void inorder(TreeNode root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 inorder(root.left);
		 if(--k==0)
		 {
			 result=root.data;
			 return;
		 }
		 inorder(root.right);
	 }
	public boolean checkTree(TreeNode root) {

		/*
		You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
        Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.


		 */
		 int right= root.right.data;
		 int left= root.left.data;

		if(right+left== root.data) {
			return true;
		}
		else
		{
			return false;
		}

	}
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.CreateBinaryTree();
		//bt.PreOrder(bt.root);
		//bt.IterativePreOrder();
		//bt.Inorder(root);
		//bt.postorder(root);
		System.out.println(bt.kthSmallest(root,3));
		//System.out.print(bt.findmax(root));
	}
}
