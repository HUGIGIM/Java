package week2;

import java.util.Scanner;


public class InputScn {
	public static void main(String[] args) {
		int a;
		String name;
		Scanner sc = new Scanner(System.in); // sc라는 새로운 객체를 만듬
		
		System.out.print("정수 입력 :");
		
		a = sc.nextInt(); // 입력을 받아서 A에 넣음
		
		System.out.print("이름 입력 :");
		
		name = sc.next(); // 입력을 받아서 name에 넣음
		
		 
		
		System.out.println(a);
		System.out.println(name);
		sc.close(); // 없어도 실행은 되지만 오류를 없애줌 
		}
}
