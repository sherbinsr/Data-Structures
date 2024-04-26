import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTree {
   
	private static TreeNode root;
	
	private static class TreeNode
	{
		private int data;
		private TreeNode right;
		private TreeNode left;
		
		public TreeNode(int data) 
		{
			this.data=data;
		}
		
	} 
	public void insert(int value) 
	{
		root=insert(root,value);
	}
	public TreeNode insert(TreeNode root,int value) 
	{
		if(root==null) 
		{
			root= new TreeNode(value);
			return root;
		}
		if(value<root.data) 
		{
			root.left=insert(root.left,value);
		}
		else 
		{
			root.right=insert(root.right,value);
		}
		return root;
		
	}

	public TreeNode search(TreeNode root, int key) 
	{
		if(root==null||root.data==key) 
		{
			return root;
		}
		if(key<root.data) 
		{
			return search(root.left,key);
		}
		else 
		{
			return search(root.right,key);
		}
	

	}

	List<Integer>li = new ArrayList<>();

	public boolean isUnivalTree(TreeNode root) {
		int data=root.data;
		return check(root,data);

	}
	boolean check(TreeNode root, int val){
		if(root==null){
			return true;
		}
		if(root.data!=val){
			return false;
		}
		return check(root.left,val) && check(root.right,val);

	}
	public void inorder(TreeNode root)
	{
		if(root==null) 
		{
			return;
		}
		inorder(root.left);
		li.add(root.data);
		inorder(root.right);
	}
	//inorder traversal via list
	public List<Integer> inorderTraversal(TreeNode root) {

		inorder(root);
		return li;
	}
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

			inorder(root1);
			inorder(root2);
		Collections.sort(li);
		return li;
	}
	public void flatten(TreeNode root) {
		if (root == null) return;
		List<Integer> values = new ArrayList<>();
		preorder(root, values);
		TreeNode current = root;
		for (int i = 1; i < values.size(); i++) {
			current.left = null;
			current.right = new TreeNode(values.get(i));
			current = current.right;
		}
	}

	public void preorder(TreeNode root, List<Integer> values) {
		if (root == null) return;
		values.add(root.data);
		preorder(root.left, values);
		preorder(root.right, values);
	}
	public TreeNode removeLeafNodes(TreeNode root, int target) {

		return  helper(root,target);
	}
	TreeNode helper(TreeNode root , int target) {
		if(root==null)
		{
			return null;
		}
		root.left=helper(root.left,target);
		root.right=helper(root.right,target);
		if(root.data==target && root.left==null && root.right==null)
		{
			return null;
		}
		return root;
	}
	public static void main(String[] args) {
	BinarySearchTree bst =  new BinarySearchTree();
	bst.insert(8);
	bst.insert(5);
	bst.inorder(root);
	System.out.println();
		
	}
	
}
