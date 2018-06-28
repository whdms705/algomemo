package memo.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
 * @Content: Tree�� ��� Path Ž���ϱ�
 * @Author : eunho
 */

class BinaryTree {
	Tree root = null;

	//Ʈ�� ����
	public BinaryTree() {
		Tree n1 = new Tree();
		n1.data = 10;
		root = n1;
		Tree n2 = new Tree();
		n1.left = n2;
		n2.data = 7;
		Tree n3 = new Tree();
		n2.left = n3;
		n3.data = 3;
		Tree n4 = new Tree();
		n2.right = n4;
		n4.data = 9;
		Tree n5 = new Tree();
		n3.left = n5;
		n5.data = 1;
		Tree n6 = new Tree();
		n1.right = n6;
		n6.data = 20;
		Tree n7 = new Tree();
		n6.right = n7;
		n7.data = 30;

	}

	//Ž������
	public void Traverse() {
		List<Tree> nodelist = new ArrayList<Tree>();
		PrintAllPossiblePath(root,nodelist);
	}

	//��� path Ž��
	public void PrintAllPossiblePath(Tree node,List<Tree> nodelist)
	{
	    
		if(node != null)
	    {
	            nodelist.add(node);
	            if(node.left != null)
	            {
	                PrintAllPossiblePath(node.left,nodelist);
	            }
	            if(node.right != null)
	            {
	                PrintAllPossiblePath(node.right,nodelist);
	            }
	            else if(node.left == null && node.right == null)
	            {
		            for(int i=0;i<nodelist.size();i++)
		            {
		                System.out.print(nodelist.get(i).data+" ");
		            }
		            System.out.println();
		            System.out.println("---------------------------------");
	            }
	            nodelist.remove(node);//�̰� �ٽ�
	    }
		
	}


	private class Tree {
		int data;
		Tree left;
		Tree right;
	}

}

public class TreeAllPathPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t1 = new BinaryTree();
		t1.Traverse();
	}
	

}
