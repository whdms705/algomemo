package memo;


/*
 * 미로 탈출구 있는지 확인
 * infrun - recursion - maze
 * 조은호
 */

public class MazePath {
	private static int n=8;
	private static int[][] maze= {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	
	private static final int PATHWAY_COLOR=0;
	private static final int WAL_COLOR=1;
	private static final int BLOCKED_COLOR=2;
	private static final int PATH_COLOR=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMazePath(0,0);
	}
	
	public static boolean findMazePath(int x,int y){
		
		return false;
	}

}
