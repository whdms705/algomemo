package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleRemove {

	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int n;// ���
	      int d; // ����   >> 1:�ð���� , 0:�ݽð����
	      int k,j;// ��ŭ �̵�
	      //System.out.println("������� �����Ѱ���?");
	      n=sc.nextInt();
	      //System.out.println("������ �Է��Ͻÿ�");
	      d=sc.nextInt();
	      //System.out.println("k,j�Է�");
	      k=sc.nextInt();
	      j=sc.nextInt();
	     
	      solution(n,d,k,j);
	   }
	   
	   public static void solution(int n,int d,int k,int j){
	      System.out.println(" ");
	      int preIndex=0;//���� ��ġ ������ ���� ����
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      
	      // ó���� ȸ�� ���⿡ ���� ���� (�ð���� , �ݽð����)
	      for(int i=0;i<n;i++){
	         if(i==0) {
	            list.add(i+1);
	         }
	         if(d==1 && i!=0) {
	            list.add(i+1);
	         }
	         if(d==0 && i!=0){
	            list.add((n-i)+1);
	         }
	      }
	      
	      //  ���� ���� Ȯ��
	      listView(list);
	      
	      while(list.size()!=1){//�Ѹ��� ���� ������ ����.
	         System.out.println();
	         if(list.size()!=n){
	            preIndex=(preIndex+k+j)%list.size()-1;
	            k=k+j;//ó������ k��ŭ ���߿� k���� j��ŭ ����
	            System.out.println("ó��! : "+preIndex);
	         }else if(list.size()==n){
	            preIndex=(preIndex+k)%list.size();
	            System.out.println("ó�� : "+preIndex);
	         }
	         list.remove(preIndex);
	         listView(list);
	      }
	   
	   }
	   
	   // �����ȿ� �ο��� üũ
	   public static void listView(ArrayList<Integer> list){
	      System.out.println();
	      for(int i : list){
	         System.out.print(" >> "+i);
	      }
	   }

}
