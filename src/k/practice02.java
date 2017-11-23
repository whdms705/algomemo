package k;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr = "1D2S3T*";
		String arr2="";
		String[] temp = arr.split("");
		String[] temp2=null;
		

		
		//각 결과값을 관리하는 변수
		int[] result=new int[3];
		
		//합의 값
		int sum=0;
		
		int check=0;
		for(int i=0;i<temp.length;i++){
			if(isNumber(temp[i])){
				if(!isNumber(temp[i+1])){
					temp[i]=","+temp[i];
				}
			}
			arr2=arr2+temp[i];
		}
		
		
		String arr2Temp=arr2.replaceFirst(",", "");
		temp2=arr2Temp.split(",");
		
		System.out.println(temp2[0]);
		System.out.println(temp2[1]);
		System.out.println(temp2[2]);
		
		// end 여기까지 3파트로 나누기 끝
		
		
		
		for(int i=0;i<3;i++){
			
				String[] content=temp2[i].split("");
			
				if(temp2[i].contains("S")){
					
					if(isNumber(content[0])&&isNumber(content[1])){
					result[i]=Integer.parseInt(content[0]+content[1])*1;
					}
					if(isNumber(content[0])&&!isNumber(content[1])){
					result[i]=Integer.parseInt(content[0])*1;
					}
					
				}
				if(temp2[i].contains("D")){
					
					if(isNumber(content[0])&&isNumber(content[1])){
					result[i]=Integer.parseInt(content[0]+content[1])*Integer.parseInt(content[0]+content[1]);
					}
					if(isNumber(content[0])&&!isNumber(content[1])){
					result[i]=Integer.parseInt(content[0])*Integer.parseInt(content[0]);
					}	
					
				}
				if(temp2[i].contains("T")){
					
					if(isNumber(content[0])&&isNumber(content[1])){
					result[i]=Integer.parseInt(content[0])*Integer.parseInt(content[0]+content[1])*Integer.parseInt(content[0]+content[1]);
					}
					if(isNumber(content[0])&&!isNumber(content[1])){
					result[i]=Integer.parseInt(content[0])*Integer.parseInt(content[0])*Integer.parseInt(content[0]);
					}
					
				}
				
				if(temp2[i].contains("*")){
					if(i==0){
						result[i]=result[i]*2;
					}
					if(i==1 || i==2){
						result[i-1]=result[i-1]*2;
						result[i]=result[i]*2;
					}
				}
				if(temp2[i].contains("#")){
					result[i]=result[i]*-1;
				}
				
			
		}
		System.out.println("++++++++++++++++++++++++");
		for(int i : result){
			System.out.println(i);
			sum=sum+i;
		}
		
		System.out.println("result sum value : "+sum);
         
    }
  
    public static boolean isNumber(String str){
        boolean result = false;
         
         
        try{
            Double.parseDouble(str) ;
            result = true ;
        }catch(Exception e){}
         
         
        return result ;
    }


	

}
