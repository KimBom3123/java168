package rps;

import java.util.Scanner;

public class WhileDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴 1. 게임 실행  0. 종료");
			switch(scanner.nextInt()) {
			case 0: System.out.println("게임 종료");return;
			case 1: System.out.println("게임 중....");break;
			default: System.out.println("올바른 값이 아닙니다.");break;}
		}
	}
}