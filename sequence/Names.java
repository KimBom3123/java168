package sequence;

public class Names {
	public static void main(String[] args) {
		String[] names = {"a", "b", "c", "d", "e"};
		// ace를 출력
		String ace = "";
		int i = 0;			// 얘는 인덱스 개념
		while(true) {
			if(i < names.length) {
				if(i % 2 == 0)
					ace += names[i];
					i++;
				}else {
					break;
				}
		}
			System.out.println(ace);
		}
	}