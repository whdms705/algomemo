package memo;

import java.util.Arrays;
import java.util.Scanner;

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
		
		for(int x : xValues){
			System.out.print(x+" ");
		}
		System.out.println("--------------------------");
		for(int y : yValues){
			System.out.print(y+" ");
		}
		System.out.println();
		System.out.println("x max : "+xValues[xValues.length-1]);
		System.out.println("y max : "+yValues[yValues.length-1]);
		System.out.println();
		int xMax=xValues[xValues.length-1];
		int yMax=yValues[yValues.length-1];
		int[][] maxSpace=new int[yMax][xMax];
		
		for(int i=0;i<yMax;i++){
			for(int j=0;j<xMax;j++){
				System.out.print(maxSpace[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(quadrangle[0][0]+" "+quadrangle[0][1]+" "+quadrangle[0][2]+" "+quadrangle[0][3]+" ");
		for(int i=quadrangle[0][1]-1;i<quadrangle[0][3]-1;i++){
			for(int j=quadrangle[0][0]-1;j<quadrangle[0][2]-1;j++){
				System.out.println("i : "+(i)+" j : "+(j));
				maxSpace[i][j]=1;
			}
		}
		
		for(int i=0;i<xMax;i++){
			for(int j=0;j<yMax;j++){
				System.out.print(maxSpace[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
