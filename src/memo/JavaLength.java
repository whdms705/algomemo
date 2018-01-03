package memo;


/*
 * java length 메소드 직접 만들어 보기
 * 
 * */
public class JavaLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "skssccccssdsdsd";
System.out.println(LenthValue(content));
System.out.println(content.length());
	}
	
	// 재귀를 이용하여 length()를 만들어 봄
	public static int LenthValue(String s){
		if(s.equals("")){
			return 0;
		}else{
			return 1+LenthValue(s.substring(1));
		}
	}

}
