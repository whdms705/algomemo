package memo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �簢������ ��ħ�κ��� ������ ������ ���ϱ�
 * Ǯ�� ��� : �簢�� �ϳ��ϳ��� �������� ������ �����ϰ� ó�� 
 *  	   ���ػ簢���� 1�� ǥ�� �ٸ� �簢���� ��ġ�� �κ��� 0���� ó���Ͽ� ���� ���ϱ�
 * 		 2���� �迭 �̿�
 * */

public class QuadrangleReiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ��ü x��ǥ ,y��ǥ �ִ밪 ã��
		//2. ����  �簢�� x��ǥ ,y��ǥ �ִ밪 ã��
		Scanner sc=new Scanner(System.in);
		int[][] quadrangle=new int[3][4];
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				quadrangle[i][j]=sc.nextInt();
			}
		}
		
		solution(quadrangle);

	}
	
	public static void solution(int[][] quadrangle){
		int xsize=quadrangle.length;
		int ysize=quadrangle[0].length;
		int valueSize=(xsize*ysize)/2;
		int countCheck=0;
		System.out.println("�迭�� ũ�� : "+valueSize);
		int[] xValues=new int[valueSize];
		int[] yValues=new int[valueSize];
		int index1=0;
		int index2=0;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				if((j%2)==0){
					xValues[index1++]=quadrangle[i][j];
				}
				if((j%2)==1){
					yValues[index2++]=quadrangle[i][j];
				}
			}
		}
		
		Arrays.sort(xValues);
		Arrays.sort(yValues);
		
		
		
		int xMax=xValues[xValues.length-1];
		int yMax=yValues[yValues.length-1];
		int[][] maxSpace=new int[yMax][xMax];
		
		for(int i=0;i<yMax;i++){
			for(int j=0;j<xMax;j++){
				System.out.print(maxSpace[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		// ù��° �簢���� ���� ���ϱ� 1�� ǥ��
		//System.out.println(quadrangle[0][0]+" "+quadrangle[0][1]+" "+quadrangle[0][2]+" "+quadrangle[0][3]+" ");
		
		for(int i=quadrangle[0][1]-1;i<quadrangle[0][3];i++){
			for(int j=quadrangle[0][0]-1;j<quadrangle[0][2];j++){
				//System.out.println("i : "+(i)+" j : "+(j));
				maxSpace[i][j]=1;
			}
		}
		
		for(int i=0;i<yMax;i++){
			for(int j=0;j<xMax;j++){
				System.out.print(maxSpace[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		// �ι�° �簢���� ������ ������(ù��° �簢����) �������� �������� 0���� ǥ��
		for(int i=quadrangle[1][1]-1;i<quadrangle[1][3];i++){
			for(int j=quadrangle[1][0]-1;j<quadrangle[1][2];j++){
				//System.out.println("i : "+(i)+" j : "+(j));
				maxSpace[i][j]=0;
			}
		}
		
		for(int i=0;i<yMax;i++){
			for(int j=0;j<xMax;j++){
				System.out.print(maxSpace[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		// ����° �簢���� ������ ������(ù��° �簢����) �������� �������� 0���� ǥ��
		for(int i=quadrangle[2][1]-1;i<quadrangle[2][3];i++){
			for(int j=quadrangle[2][0]-1;j<quadrangle[2][2];j++){
				//System.out.println("i : "+(i)+" j : "+(j));
				maxSpace[i][j]=0;
			}
			
		}
		
		for(int i=0;i<yMax;i++){
			for(int j=0;j<xMax;j++){
				System.out.print(maxSpace[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// 1�� ������ ���� ������ ����
		for(int i=quadrangle[0][1]-1;i<quadrangle[0][3];i++){
			for(int j=quadrangle[0][0]-1;j<quadrangle[0][2];j++){
				if(maxSpace[i][j]==1){
					countCheck++;
				}
			}
		}
		
		System.out.println("1�� ������ : "+countCheck);
		
		
	}

}
