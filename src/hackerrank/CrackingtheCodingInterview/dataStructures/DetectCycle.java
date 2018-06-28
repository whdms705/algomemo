package hackerRank.CrackingtheCodingInterview.dataStructures;

import hackerRank.CrackingtheCodingInterview.dataStructures.Cycle.Node;

/*
 * @Content : likedList�� ��ȯ���� ���ȯ���� üũ 
 * @Comment : �ź��̿� �䳢 �˰������� ó�� 
 */
class Node{
	
	int data;
	Node next;
	
	Node head = null;
	
	public void addTail(int item){
        Node newNode=new Node();
        newNode.data=item;
        if(head==null){
            head=newNode;
            System.out.println(head.data);
            
        }else{
            while(head.next!=null){
                head=head.next;
            }
            head=newNode;
            System.out.println(head.data);
        }
    }
	
	
	
}

public class DetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input
		Node node=new Node();
        
		node.addTail(101);
		node.addTail(201);
		node.addTail(301);
        node.addTail(401);
        
        DetectCycle check = new DetectCycle(); 
    
        // output
        if(check.hasCycle(node)){
            System.out.println("result: 1");
        }else{
            System.out.println("result: 0");
        }
	}
	
	//��ȯ ���ȯ ����
	boolean hasCycle(Node head) {
		Node rabbit=head;//fast
        Node turtle=head;//slow
        while(rabbit!=null&&rabbit.next!=null){
            rabbit=rabbit.next.next;
            turtle=turtle.next;
            if(rabbit==turtle){
                return true;
            }
        }
        return false;
	}
	
	

}
