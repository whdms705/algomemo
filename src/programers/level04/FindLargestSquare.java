package programers.level04;

public class FindLargestSquare {

	public int findLargestSquare(char [][]board)
    {
        int answer = 0;

        return answer;
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

}
