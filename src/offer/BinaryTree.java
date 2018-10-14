package offer;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree{
	
	private TreeNode root;
	
	//�ڵ��б����ڽ�����Ԫ��ת��Ϊ�ڵ� 
	private List<TreeNode> list = null;
	
	
	public BinaryTree() {}
	
	public void setRoot(TreeNode node) {
		this.root = node;
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	public BinaryTree(TreeNode node) {
		this.root = node;
	}
	
	//����ڵ�
	public static class TreeNode{
		public TreeNode () {}
		
		private String data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(String data,TreeNode left,TreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public TreeNode(String data) {
			this.data = data;
		}
		
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		
		public void setRight (TreeNode right) {
			this.right = right;
		}
		
		public void setData(String data) {
			this.data = data;
			
		}
		
		public TreeNode getLeft() {
			return left;
		} 
		public TreeNode getRight() {
			return right;
		}
		public String getData() {
			return data;
		}
	}
	
	//���ظ��ڵ�
	public TreeNode getParent(TreeNode node) {
		return (root == null || root == node) ? null : parent(root,node);
	}
	
	public TreeNode parent(TreeNode root,TreeNode node) {
		if(root == null) {
			return null;
		}
		
		if(root.getLeft() == node || root.getRight() == node) {
			return root;
		}
		TreeNode p = null;
		if((p = parent(root.getLeft(),node)) != null) {
			return p;
		}else {
			return parent(root.getRight(),node);
		}
	}
	
	//�ڵ����
	public int getSize() {
		return getNum(root);
	}
	
	private int getNum(TreeNode root) {
		if(root == null) {
			return 0;
		}else {
			int i = getNum(root.getLeft());
			int j = getNum(root.getRight());
			return i+j+1;
		}
	}
	
	//���߶�
	public int getHight() {
		return getHight(root);
	}
	
	private int getHight(TreeNode node) {
		if(node == null) {
			return 0;
		}else {
			int i = getHight(node.getLeft());
			int j = getHight(node.getRight());
			return (i > j) ? (i + 1) :(j + 1);
		} 
	}
	
	//ǰ�����
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.println(node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	//�������
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.getLeft());
			System.out.println(node.getData());
			inOrder(node.getRight());
			
		}
	}
	
	//�������
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.println(node.getData());
		}
	}
	
	public static void main(String[] args) {
		Object[] objs={1,2,3,4,5,6,7};  
        BinaryTree binTree = new BinaryTree();
        binTree.createTreeByArray(objs);  
        System.out.println("=======�������======");
        binTree.preOrder(binTree.list.get(0));
        System.out.println("=======�������======");
        binTree.inOrder(binTree.list.get(0));
        System.out.println("========�������=======");
        binTree.postOrder(binTree.list.get(0));
		
//		TreeNode l12 = new TreeNode("4", null, null);
//        TreeNode r12 = new TreeNode("5", null, null);
//        TreeNode l22 = new TreeNode("6", null, null);
//        TreeNode r22 = new TreeNode("7", null, null);
//
//        TreeNode l1 = new TreeNode("2", l12, r12);// ���ڵ�������
//        TreeNode r1 = new TreeNode("3", l22, r22);// ���ڵ�������
//        TreeNode root = new TreeNode("1", l1, r1);// �������ڵ�
//
//        BinaryTree bt = new BinaryTree(root);
//        System.out.println("=======�������======");
//        bt.preOrder(bt.getRoot());
//        System.out.println("=======�������======");
//        bt.inOrder(bt.getRoot());
//        System.out.println("========�������=======");
//        bt.postOrder(bt.getRoot());
//        System.out.println("===========");
//        System.out.println(bt.getHight());
//        System.out.println(bt.getSize());
//
//        System.out.println(bt.getParent(r22).getData());
        
        
	}

	private void createTreeByArray(Object[] objs) {
		this.list = new ArrayList<TreeNode>();
		for(Object obj : objs) {
			list.add(new TreeNode(obj.toString()));
		}
		
		 System.out.println("ͷ�ڵ�->" + list.get(0).getData());
		 this.root = new TreeNode(list.get(0).getData()); //���ڵ�
		 
		 //Ϊ��������ֵ
		 for(int i = 0; i < (list.size() / 2);i ++) {
			 try {
			 list.get(i).left = list.get(i*2+1);
			 System.out.println("�ڵ�" + list.get(i).getData() + "������ ->" + list.get(i * 2 + 1).getData());
			 list.get(i).right = list.get(i*2+2);
			 System.out.println("�ڵ�" + list.get(i).getData() + "������ ->" + list.get(i * 2 + 2).getData());
			 } catch (Exception e) {
			}
		 }
	}
}

