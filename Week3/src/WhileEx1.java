
public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, sum = 0;
		
		i = 1;
		while (i<=10) {
			sum += i;   // 값을 누적
			System.out.print(i); 
			i++;//ln을 없앰    
		}
		
		if (i <= 10)   // if절은 true or false 만 실행함 
			System.out.print("+");
		
		else
		{
			System.out.print("=");
			System.out.print(sum);
		}
		
		
		
		
	}

}
