package TypeExam2;

public class �Լ�����¹� {
	public static void main(String[] args) {
		int v1 = 10;// 
		System.out.println(toBianry(v1));
	}
	
	public static String toBianry(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() <32) {
			str = "0" + str;
		}
		return str;
	}
}

	 
	 
	 
	 
	 
	 
 }
}
