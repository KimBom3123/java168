package matrix;

import java.util.Random;

public class Rank {
	public static void main(String[] args) {
		Random random = new Random();
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(101);
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; i > j; j++) {
				if (score[i] > score[j]) {
					int temp = score[i]; 
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d등\t%d점\n", i + 1, score[i]);
		}
	}

}