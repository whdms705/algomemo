package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleRemove {

	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int n;// 몇명
	      int d; // 방향   >> 1:시계방향 , 0:반시계방향
	      int k,j;// 얼만큼 이동
	      //System.out.println("몇명으로 시작한가요?");
	      n=sc.nextInt();
	      //System.out.println("방향을 입력하시오");
	      d=sc.nextInt();
	      //System.out.println("k,j입력");
	      k=sc.nextInt();
	      j=sc.nextInt();
	     
	      solution(n,d,k,j);
	   }
	   
	   public static void solution(int n,int d,int k,int j){
	      System.out.println(" ");
	      int preIndex=0;//현재 위치 저장을 위한 변수
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      
	      // 처음에 회원 방향에 맞쳐 세팅 (시계방향 , 반시계방향)
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
	      
	      //  순서 설정 확인
	      listView(list);
	      
	      while(list.size()!=1){//한명이 남을 때까지 돈다.
	         System.out.println();
	         if(list.size()!=n){
	            preIndex=(preIndex+k+j)%list.size()-1;
	            k=k+j;//처음에는 k만큼 나중에 k값이 j만큼 증가
	            System.out.println("처음! : "+preIndex);
	         }else if(list.size()==n){
	            preIndex=(preIndex+k)%list.size();
	            System.out.println("처음 : "+preIndex);
	         }
	         list.remove(preIndex);
	         listView(list);
	      }
	   
	   }
	   
	   // 원형안에 인원수 체크
	   public static void listView(ArrayList<Integer> list){
	      System.out.println();
	      for(int i : list){
	         System.out.print(" >> "+i);
	      }
	   }

}
