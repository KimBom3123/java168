package test;
public class Shop {
	
	private String name;
	private int phone, tv, computer, sum;
	
	public void setName(String name) { // ���� �����Ѵ�. ����
		this.name = name; 
	}
	public String getName() {
		return this.name; // ���� ��ȯ�Ѵ�
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
		name + "���� " + "�� ����: " + phone + "����, " + "TV ����: " + tv + "����, " + "��ǻ�� ����: " + computer + "����, " + "�����Ͻ� �� �ݾ��� " + sum + "���� �Դϴ�. ");
}
}