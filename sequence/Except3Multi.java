package sequence;
/*
 [결과] 1 2 4 5 7 8 10
 */
public class Except3Multi {
	public static void main(String[] args) {
	int[] arr = new int[7];		// new 뒤에 위치하는 것들은 생성자가 된다
	int j = 0;
	for(int i = 0; i < 10; i++) {
		int t = i+1;
		if(t % 3 != 0) {
			arr[j] = t;
			j++;
			}
		}
	for(int i = 0; i < arr.length;i++) {
		System.out.printf("%d\t",arr[i]);
		}
	}
}