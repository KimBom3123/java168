package sequence;
// 5명의 심사위원의 점수중에서 0 ~ 100점 만점에서 최고점과 최하점을 제외한 5명 점수평균구하기
import java.util.Scanner;

public class FigureScore {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int[] score = new int[5];
		int max = 0, min = 100;
		for(int i = 0; i < 5; i++) {
			System.out.println("점수: ");
			score[i] = scanner.nextInt();
			sum += score[i];		// sum = sum + score[i];
			if(max > score[i]) {
				max = score[i];
			}
			if(min < score[i]) {
				min = score[i];
			}
		} 
		sum -= max;
		sum -= min;
		System.out.println("평균: " + sum/3);
	}

}