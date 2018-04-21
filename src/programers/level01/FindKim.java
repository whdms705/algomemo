package programers.level01;


public class FindKim {
	public String findKim(String[] seoul){
		
		int x = 0;
		int count=0;
	    for(String s:seoul){
	    	if(s.contains("Kim")){
	    		x=count;
	    	}
	    	count++;
	    }
	    
	    //int x = Arrays.asList(seoul).indexOf("Kim");  A Better Way

		
		return "�輭���� "+ x + "�� �ִ�";
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}