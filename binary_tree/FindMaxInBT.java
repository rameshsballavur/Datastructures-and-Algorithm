package binary_tree;


public class FindMaxInBT {
  TreeNode root;
  
  class TreeNode{
	  int data;
	  TreeNode left;
	  TreeNode right;
	  
	  public TreeNode(int data) {
		  this.data = data;
	  }
  }
  
  public void createBinaryTree() {
	  TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
  }
  
  public int findMax(TreeNode root) {
	  if(root == null) {
		  return Integer.MIN_VALUE;
	  }
	  
	  int result = root.data;
	  int left = findMax(root.left);
	  int right = findMax(root.right);
	  if(left>result) {
		  result = left;
	  }
	  if(right>result) {
		  result = right;
	  }
	  
	  return result;
  }
  
  public static void main(String[] args) {
	FindMaxInBT f = new FindMaxInBT();
	f.createBinaryTree();
	System.out.println("Maximum value is: "+f.findMax(f.root));
}
}
