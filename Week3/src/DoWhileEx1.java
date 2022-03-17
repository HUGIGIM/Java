
public class DoWhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		
		do {
			System.out.print(ch);
			//ch++;
			ch = (char)(ch + 1);
		} 
		while (ch <='z');
	}

}
