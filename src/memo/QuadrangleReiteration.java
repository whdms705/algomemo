package memo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 사각형들의 겹침부분을 제외한 면적을 구하기
 * 풀이 방식 : 사각형 하나하나의 면적값을 점으로 생각하고 처리 
 *  	   기준사각형은 1로 표시 다른 사각형과 겹치는 부분은 0으로 처리하여 면적 구하기
 * 		 2차원 배열 이용
 * */

public class QuadrangleReiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 전체 x좌표 ,y좌표 최대값 찾기
		//2. 각자  사각형 x좌표 ,y좌표 최대값 찾기
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
		System.out.println("배열의 크기 : "+valueSize);
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
		// 첫번째 사각형의 면적 구하기 1로 표시
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
		// 두번째 사각형의 면적과 기준의(첫번째 사각형의) 교집합을 빼기위해 0으로 표시
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
		// 세번째 사각형의 면적과 기준의(첫번째 사각형의) 교집합을 빼기위해 0으로 표시
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
		
		
		// 1의 개수를 통해 면적을 구함
		for(int i=quadrangle[0][1]-1;i<quadrangle[0][3];i++){
			for(int j=quadrangle[0][0]-1;j<quadrangle[0][2];j++){
				if(maxSpace[i][j]==1){
					countCheck++;
				}
			}
		}
		
		System.out.println("1의 개수는 : "+countCheck);
		
		
	}

}
