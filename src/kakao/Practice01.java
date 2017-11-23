package kakao;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr1={9,20,28,18,11};
		int[] arr2={30,1,21,17,28};*/
		
		int[] arr1={46,33,33,22,31,50};
		int[] arr2={27,56,19,14,14,10};
		
		
		String temp1="";
		String temp2="";
	
		
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//5
		String[] result=new String[n];
		if(1<=n&&n<=16){
			
			
			
			for(int i=0;i<n;i++ ){
				temp1=convert(arr1[i],n);
				temp2=convert(arr2[i],n);
				System.out.println("=========");
				String[] check1=temp1.split("");
				String[] check2=temp2.split("");
				for(int j=0;j<n;j++){
					if(check1[j].equals("1")||check2[j].equals("1")){
						if(j==0){
							result[i]="#";
						}else{
							result[i]=result[i]+"#";
						}
					}else{
						if(j==0){
							result[i]=" ";
						}else{
							result[i]=result[i]+" ";
						}
					}
				}
				
			}
			
			System.out.println("-----------------------");
			
			for(String s : result){
				System.out.println(s);
			}
			
			
			
		}

	}
	
	public static String convert(int input,int len){
		  int n = input;
		  int []b = new int[32];
		  
		  String value="";
		  String temp="";
		   
		  int i = 0;
		  while(n != 1)
		  {
		   //System.out.println(i);
		   b[i++] = n%2;
		   n = n/2;
		  }

		  //System.out.print(i+" "+n);
		  b[i] = n;
		   
		  for(int j = i; j >= 0; --j)
		  {
			  temp=temp+b[j];
		  }
		  
		  System.out.println(temp);
		  value=temp;
		  
		  for(int j=0;j<len-temp.length();j++){
			  value="0"+value;
		  }
		  
		  System.out.println(value);
		  System.out.println("***************");
		  return value;

	}

}
