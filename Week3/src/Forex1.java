

public class Forex1 {

	public static void main(String[] args) {
										//변수 할당 값 주기 
		int i, sum = 0;
		for (i= 1; i <=10; i++) {
			sum += i;   // 값을 누적
			System.out.print(i);   //ln을 없앰
		}
		
		if (i <= 9)   // if절은 true or false 만 실행함 
			System.out.print("+");
		
		else
		{
			System.out.print("=");
			
		}
		
		System.out.print(sum);
	}

}
 