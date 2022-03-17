
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 0;
		
		for ( i = 1; i <= 10; i++) {
			for (j = 1; j< 10; j++) {
//				System.out.print(i+"X"+j+"="+i*j);
				System.out.printf("%d * %d = %d",i,j,i*j);//%d 정
				System.out.print("\t");
			}
			System.out.println();   // %s문자  %f실 
		}
		
	}

}
