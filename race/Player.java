package race;

public class Player {
	
	private String name;
	private int record;
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;     // getname, setname은 private에 값을 
	}
	public void setRecord (int record) {
		this.record = record;
	}
	public int getRecord () {
		return this.record;
	}
	public void showRecord() {
		System.out.println("성함: " + name + ", 100m 기록: " + record + "초");
		
	}
	

}
