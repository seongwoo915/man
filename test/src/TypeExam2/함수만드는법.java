package TypeExam2;

public class 함수만드는법 {
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
