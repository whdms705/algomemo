package programers.level04;



public class ChooseCity {

	public int chooseCity(int n, int [][]city)
    {
        int answer = 0;
        int sum=0;
        int min=0;
        for(int i=0;i<n;i++){
        	
        	sum=0;
        	int[][] temp = city.clone();
        	
        	if(i!=0){
        		int temp1=temp[i][0];
            	int temp2=temp[i][1];
            	temp[i][0]=temp[0][0];
            	temp[i][1]=temp[0][1];
            	temp[0][0]=temp1;
            	temp[0][1]=temp2;
        	}
        	for(int j=0;j<n-1;j++){
        		int a = temp[0][0];
        		int b = temp[j+1][0];
        		int num1=(a>b)?a:b;
        		int num2=(a>b)?b:a;
        		
        		sum+=(num1-num2)*temp[j+1][1];
        		
        	}
        	
        	if(i==0){
        		min=sum;
        	}else{
        		if(min>sum){
        			min = sum;
        			answer = city[i][0];
        		}else{
        			
        		}
        	}
        	
        }
        return (answer+1);
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
    
    public static void print(int[][] arr){
    	int n1 = arr.length;
    	int n2 = arr[0].length;
    	System.out.println();
    	for(int i=0;i<n1;i++){
    		for(int j=0;j<n2;j++){
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }

}
