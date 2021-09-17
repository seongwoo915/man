package ch08;

public class VariableScopeExam1 {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		int var1=0;
		
		System.out.println(var1);
		
		if(true) {
			//main메소드내의 if블럭에서 선언된 로컬변수
			int var2;
			var1 = 1;//main메소드내의 if블럭내에서 사용가능
			var2 = 2;//자신이 선언된 블럭내에서 사용가능
			int result = var1 + var2;
			System.out.println(result);
			
			
		}
		
		while(true) {
			//main메소드내의 while블럭에서 선언된 로컬변수
			int var3;
			System.out.println(var1);
			var3=3;
			var1=4;
			System.out.println(var1 + var3);
			
			//var2=5;
			break;//반복문을 빠져나가게 하는 명령어
			
			
			
			
		}
	}

}
