package matrix;

public class Gugudan1 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i ++) {
			for(int j = 2; j < 6 ; j++) {			// 단을 만들기 위해서 이중for문을 건다
			System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
			System.out.println();
		 for(int i = 1; i < 10; i++) {
			 for(int j = 6; j < 10; j++) {
			System.out.printf("%d * %d = %d\t", j, i, j * i);
			 } 
			System.out.println();
		 }
	}
}