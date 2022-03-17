import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0; 
		System.out.println("5개의 정수를 입력하세요!!!");
		
		int i = 1;
		while(i <= 5)
		{
			System.out.println(i+"번째 정수 입력 :");
				int num = scanner.nextInt();
				if (num < 0) {		
					i++;
				continue;
			}
				sum += num;
				i++;
		}
		System.out.println("양의 정수들의 합은 " + sum);
	}

}
