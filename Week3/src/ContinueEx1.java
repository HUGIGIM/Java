import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;  //항시 초기화
		
		System.out.println("5명의 정수를 입력하세요");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d 번째 정수 : ",i+1);
			int num = scanner.nextInt();

			if (num < 0) 
				continue;
			sum += num;
			}
			
			System.out.println("입력한 양의 정수들의 합 = "+sum);
		
			scanner.close();
		}
		
	}


