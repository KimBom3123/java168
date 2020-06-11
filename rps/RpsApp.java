package rps;

import java.util.Random;
import java.util.Scanner;

/*
"가위, 바위, 보를 고르세요."
"1. 가위 2. 바위  3. 보"
"*******************"
"플레이어: 가위"
"컴퓨터: 보"
"플레이어 (승리 || 패배 || 무승부)"
*/

public class RpsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String result = "";
		
		System.out.println("가위, 바위, 보를 고르세요.");
		System.out.println("1. 가위 2. 바위 3. 보");
		int player = scanner.nextInt();
		int computer = random.nextInt(3) + 1;
	
		if (player == computer) {
			result = "무승부";
		} else if (player == 2 && computer == 1) {
			result = "패배";
		} else if (player == 1 && computer == 3) {
			result = "승리"; 
		} else if (player == 2 && computer == 1) {
			result = "승리";
		} else if (player == 2 && computer == 3) {
			result = "패배";
		} else if (player == 3 && computer == 1) {
			result = "패배";
		} else if (player == 3 && computer == 2) {
			result = "승리";
		} else {
			result = "오류";
		}
		
		String rpsP = "";
		if (player == 1) {rpsP = "가위";
		} else if (player == 2) {rpsP = "바위";
		} else {rpsP = "보";}
		
		String rpsC = "";
		if (computer == 1) {rpsC = "가위";
		} else if (player == 2) {rpsC = "바위";
		} else {rpsC = "보";}
		
		
		System.out.println("*******************");
		System.out.println("플레이어: " + rpsP);
		System.out.println("컴퓨터: " + rpsC);
		System.out.println("플레이어 " + result);
	}

}