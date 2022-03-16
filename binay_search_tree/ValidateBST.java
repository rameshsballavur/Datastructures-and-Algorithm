package binay_search_tree;

public class ValidateBST {
	TreeNode root;
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBST() {
		TreeNode first   = new TreeNode(6);
		TreeNode second  = new TreeNode(4);
		TreeNode third   = new TreeNode(8);
		TreeNode fourth  = new TreeNode(3);
		TreeNode fifth   = new TreeNode(8);
		TreeNode sixth   = new TreeNode(7);
		TreeNode seventh = new TreeNode(9);
		
		root         = first;
		first.left   = second;
		first.right  = third;
		second.left  = fourth;
		second.right = fifth;
		third.left   = sixth;
		third.right  = seventh;
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
	
	public boolean isValid(TreeNode root, long min,long max) {
		if(root==null) {
			return true;
		}
		
		if(root.data<=min || root.data>=max) {
			return false;
		}
		
		boolean left = isValid(root.left,min,root.data);
		if(left) {
			boolean right = isValid(root.right,root.data,max);
			return right;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ValidateBST v = new ValidateBST();
		v.createBST();
		v.inOrder();
		boolean res = v.isValid(v.root,Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.println();
		System.out.println(res);
	}
}
