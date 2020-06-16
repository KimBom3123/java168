package matrix;

import java.util.Random;

class Lotto{
	int[] lotto;
	public boolean isDuplication(int[] lotto, int num) {
		boolean ok = false;
		for(int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) ok = true;
		}
		return ok;
	}
}

public class LottoApp {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		Lotto instance = new Lotto();
		for(int i = 0; i < lotto.length;i++) {		// 집어넣는 부분
				int temp = random.nextInt(45)+1;
				System.out.printf("뽑힌 값: %d\n", temp);
				if(instance.isDuplication(lotto, temp)) {
				i--;
				continue;
		}
		lotto[i] = temp;
	}
		for(int i = 0; i < lotto.length; i++) {
			int count = 0;
			
		}
		
		for(int i = 0; i < lotto.length; i++) {		// 뽑아내는 부분
			System.out.printf("%d\t", lotto[i]);
			
		}
	}
}
