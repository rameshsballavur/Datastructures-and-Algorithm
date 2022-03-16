package binay_search_tree;

public class SearchKey {
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
	
	public TreeNode insert(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
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
	
	public TreeNode searchKey(TreeNode root,int key) {
		if(root==null || root.data ==key) {
			return root;
		}
		
		if(key<root.data) {
			return searchKey(root.left,key);
		}
		else
		{
			return searchKey(root.right, key);
		}
	}
	
	public static void main(String[] args) {
		SearchKey s = new SearchKey();
		s.insert(1);
		s.insert(13);
		s.insert(3);
		s.insert(12);
		s.insert(7);
		s.insert(15);
		
		s.inOrder();
		
		System.out.println();
		
		int key = 12;
		if(s.searchKey(s.root, key) != null) {
			System.out.println("key found: "+ s.searchKey(s.root, key).data);
		}
		else {
			System.out.println("key not found");
		}
	}
	
}
