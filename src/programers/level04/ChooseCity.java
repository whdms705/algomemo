package programers.level04;

public class ChooseCity {

	public int chooseCity(int n, int [][]city)
    {
        int answer = 0;
        int sum=0;
        
        int[] result = new int[n];
        for(int i=0;i<n;i++){
        	int[][] temp = city.clone();
        	if(i!=0){
        		int temp1=temp[i][0];
            	int temp2=temp[i][1];
            	temp[i][0]=temp[0][0];
            	temp[i][1]=temp[0][1];
            	temp[0][0]=temp1;
            	temp[0][1]=temp2;
        	}
        	
        	
        }

        return answer;
    }
    public static void main(String[] args)
    {
    	ChooseCity test = new ChooseCity();
        int tn = 3;
        int [][]tcity = {
        				  {1,5}
        				 ,{2,2}
        				 ,{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }

}
