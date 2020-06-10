package test;
import java.util.Scanner;

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Shop[] arr = new Shop[3];
		for(int i = 0; i < arr.length; i++) {
			Shop student = new Shop();
			System.out.println("이름: ");
			student.setName(scanner.next());
			System.out.println("폰 가격: ");
			student.setPhone(scanner.nextInt());
			System.out.println("TV 가격: ");
			student.setTv(scanner.nextInt());
			System.out.println("컴퓨터 가격: ");
			student.setComputer(scanner.nextInt());
			student.sum();
			arr[i] = student;
		}
			
			for(int i = 0; i < arr.length; i++) {
				arr[i].printStates();
			}
		}
				
	}