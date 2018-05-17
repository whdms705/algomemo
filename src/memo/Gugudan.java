package memo;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 방식 9분
	/*	for(int i=1;i<10;i++) {
			int count=1;
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println(i+"x"+count+" = "+(i*count++));
			System.out.println();
			
		}*/
		
		//2번방식 5분
		for(int i=11;i<100;i++) {
			int a=(i/10);
			int b=(i%10);
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		
		
	}

}
