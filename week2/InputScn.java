package week2;

import java.util.Scanner;


public class InputScn {
	public static void main(String[] args) {
		int a;
		String name;
		Scanner sc = new Scanner(System.in); // sc��� ���ο� ��ü�� ����
		
		System.out.print("���� �Է� :");
		
		a = sc.nextInt(); // �Է��� �޾Ƽ� A�� ����
		
		System.out.print("�̸� �Է� :");
		
		name = sc.next(); // �Է��� �޾Ƽ� name�� ����
		
		 
		
		System.out.println(a);
		System.out.println(name);
		sc.close(); // ��� ������ ������ ������ ������ 
		}
}
