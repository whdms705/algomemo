package programers.level04;

public class FindLargestSquare {

	public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        int size = board.length;
        int[][] square = new int[size][size];
        int max = 0;
        
        // convert char -> int
        for(int i=0;i<size;i++){
        	for(int j=0;j<size;j++){
        		if(board[i][j]=='X'){
        			square[i][j]=0;
        		}else{
        			square[i][j]=1;
        		}
        	}
        }
        views(square);       
        // check max Square
        for(int i=1;i<size;i++){
        	for(int j=1;j<size;j++){
        		if(square[i][j]==1){
        			square[i][j] = square[i][j]+Math.min(Math.min(square[i-1][j],square[i-1][j-1]),square[i][j-1]);
        			if(square[i][j]>max){
        				max = square[i][j];
        				System.out.println("max : "+max);
        			}
        			
        		}
        	}
        }
        
        return max*max;
    }
    public static void main(String[] args)
    {
    	FindLargestSquare test = new FindLargestSquare();
				char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
    
    public static void views(int square[][]){
    	System.out.println();
    	int size= square.length;
    	for(int i=0;i<size;i++){
    		
    		for(int j=0;j<size;j++){
    			System.out.print(square[i][j]+" ");
    		}
    	System.out.println();
    	}
    }

}
