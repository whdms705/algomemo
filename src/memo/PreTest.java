package memo;

import java.util.Scanner;

public class PreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1={"","일","이","삼","사","오","육","칠","팔","구"};
		String[] arr2={"","십","백","천","만"};
		Scanner sc=new Scanner(System.in);
		
		String number="";
		int numberSize=0;
		boolean numberCheck=false;
		String unit="";
		StringBuilder hanNumber=new StringBuilder();
		
		do{
			System.out.print("java 숫자 한글로 변환 문제 : ");
			System.out.println("1 ~ 99999 의 정수를 입력해주새요.");
			number=sc.nextLine();
			numberCheck=isValidation(number);
			if(numberCheck){
				numberSize=number.length();
				for(int i=0;i<numberSize;i++){
					unit=arr1[Integer.parseInt(number.substring((numberSize-i)-1, numberSize-i))];
					if(!unit.equals("")){
						hanNumber.append(arr2[i]);
						hanNumber.append(unit);
					}
					
				}
				
				System.out.println(hanNumber.reverse().toString());
				sc.close();
			}
			
		}while(numberCheck==false);
		
		
		

	}
	
	public static boolean isValidation(String number) {
	    
        if(number==null || number.equals(""))
            return false;
       
        for(int i=0; i<number.length(); i++) {
            char ch = number.charAt(i);
            
            if(ch<'0' || ch>'9') {
                return false;
            }
        }
        
        if(99999<Integer.parseInt(number) || Integer.parseInt(number)<1){
        	return false;
        }
        return true;
    }

}
