package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Player[] players = new Player[3]; // 몇 명이 이 경기에 참가하는지 정함
	for(int i=0; i<players.length;i++) {
		Player player = new Player();
		System.out.println("성함: ");
		String name = scanner.next();
		player.setName(name);
		System.out.println("100m 기록: ");
		int time = scanner.nextInt();
		player.setRecord(time);
		players[i] = player;
	}
	for(int i = 0;i<players.length;i++) {
		players[i].showRecord();
	}
	
	Player[] ranking = new Player[3];  // 점수에 따라 순위를 매김
	String name = "";
	if(players[0].getRecord() < players[1].getRecord()
			&& players[0].getRecord() < players[2].getRecord()) {
		name = players[0].getName();
	}else if(players[1].getRecord()< players[0].getRecord()
			&& players[1].getRecord() < players[2].getRecord()) {
		name = players[1].getName();
	}else {
		name = players[2].getName();
		}
			
	System.out.println("1등은 " + name);
	}
}

    /**
	// System.out.println(players[0].getName()+"이 " + players[1].getName()+"보다 빠르다.");
	// System.out.println(players[1].getName()+"이 "+players[0].getName()+"보다 빠르다.");
    
    * */