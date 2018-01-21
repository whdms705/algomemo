package memo;

import java.util.Scanner;

/*
 * Ư�������� �����   blob�ȿ� cells ī��Ʈ�ϱ�
 * infrun - recursion - Counting Cells in the blobs 
 * ����ȣ
 */

public class CountingCells {
	
	
	private static int[][] land= {
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1}
	};
	private static int n=land.length;
	
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(n+"�� ������ x,y���� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
System.out.println(countCell(x,y));		
	}
	
	public static int countCell(int x,int y){
		// ���� ���� ���
		if(x<0 || y<0 || x>=n || y>=n){
			return 0;
		}else if(land[x][y]!=IMAGE_COLOR){
			return 0;
		}else{
			land[x][y]=ALREADY_COUNTED;
			return 1+countCell(x,y+1)+countCell(x+1,y+1)+countCell(x+1,y)
			+countCell(x+1,y-1)+countCell(x,y-1)+countCell(x-1,y-1)+countCell(x-1,y)
			+countCell(x-1,y+1);
		}
	}

}
