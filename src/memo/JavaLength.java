package memo;


/*
 * java length �޼ҵ� ���� ����� ����
 * 
 * */
public class JavaLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "skssccccssdsdsd";
System.out.println(LenthValue(content));
System.out.println(content.length());
	}
	
	// ��͸� �̿��Ͽ� length()�� ����� ��
	public static int LenthValue(String s){
		if(s.equals("")){
			return 0;
		}else{
			return 1+LenthValue(s.substring(1));
		}
	}

}
