package binay_search_tree;

public class InsertValue {
	TreeNode root;
	
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
	
	public void insert(int value) {
		root = insert(root,value);
	}
	
	public TreeNode insert(TreeNode root,int value) {
		if(root==null) {
			root= new TreeNode(value);
			return root;
		}
		
		if(value<root.data) {
			root.left = insert(root.left,value);
		}
		else {
			root.right = insert(root.right,value);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		InsertValue iv = new InsertValue();
		iv.insert(1);
		iv.insert(13);
		iv.insert(3);
		iv.insert(12);
		iv.insert(7);
		iv.insert(15);
		
		iv.inOrder();
	}
}


