
public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 outer :// 이름 붙이기 fo 
		for (int i = 0; i < 10; i++) {
			inner:
			for (int j = 0; j < 10; j++) {
				if ((i+j) == 6)
					break outer;
				System.out.println("i = "+ i +", j = " + j);
				
			}
			
		}
	}

}
