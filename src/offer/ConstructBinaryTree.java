package offer;

import java.util.Arrays;

/* �ؽ�������
  * ��������������ĳ��������ǰ����������������������ؽ����ö����������������ǰ���������������Ľ����
  * ���������ظ������֡���������ǰ���������:{1,2,4,7,3,5,6,8}���������{4,7,2,1,5,3,8,6},
  * ���ؽ���ͼ����ʾ�����������������ͷ��㡣
  */

//����ڵ�

public class ConstructBinaryTree {
	 static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	    if (pre == null || in == null) {
	        return null;
	    }
	    if (pre.length == 0 || in.length == 0) {
	        return null;
	    }
	    if (pre.length != in.length) {
	        return null;
	    }
	    TreeNode root = new TreeNode(pre[0]);
	    for (int i = 0; i < pre.length; i++) {
	        if (pre[0] == in[i]) {
	            root.left = reConstructBinaryTree(
	                            Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
	            root.right = reConstructBinaryTree(
	            Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
	        }
	    }
	    return root;
	}

	 // ����ǰ�������ӡ�������Ľڵ�
    public static void printPreBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.val + " ");
        }
        if (root.left != null) {
            printPreBinaryTree(root.left);
        }
        if (root.right != null) {
            printPreBinaryTree(root.right);
        }
    }
	
	public static void main(String[] args) throws Exception {
        int preOrder[] = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int inOrder[] = { 4, 7, 2, 1, 5, 3, 8, 6 };
        ConstructBinaryTree test = new ConstructBinaryTree();
        printPreBinaryTree(reConstructBinaryTree(preOrder, inOrder));
    }
}
