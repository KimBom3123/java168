package test;
public class Shop {
	
	private String name;
	private int phone, tv, computer, sum;
	
	public void setName(String name) { // 값을 지정한다. 세터
		this.name = name; 
	}
	public String getName() {
		return this.name; // 값을 반환한다
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPhone() {
		return this.phone;
	}
	public void setTv(int tv) {
		this.tv = tv;
	}
	public int getTv() {
		return this.tv;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	public int getComputer() {
		return this.computer;
	}

	public void sum() {
		this.sum = this.phone + this.tv + this.computer;
	}
	
	public void printStates() {
		System.out.println(
		name + "님의 " + "폰 가격: " + phone + "만원, " + "TV 가격: " + tv + "만원, " + "컴퓨터 가격: " + computer + "만원, " + "결제하실 총 금액은 " + sum + "입니다. ");
}
}