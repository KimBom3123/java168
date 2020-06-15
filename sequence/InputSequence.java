package sequence;

import java.util.Scanner;

/*
1부터 합산하고자 하는 한계 숫자를 입력하시오
1부터 합산한 숫자(이하)범위내에서 홀수의 합을 출력하시오. 
 */
public class InputSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한계 숫자를 입력하세요.");
		int lim = scanner.nextInt();
		int sum = 0;
		int i = 0;
		for(i = 0; i <lim ; i++) {
			System.out.println(i+1);	// 인덱스값은 0부터 시작하기 때문에 1을 더해준다
			if((i + 1) % 2 != 0) {
				sum += (i+1);				
			}
		
		// 배열을 쓸 때에는 무조건 length를 사용한다
		
		}
		System.out.println(sum);
	}

}
