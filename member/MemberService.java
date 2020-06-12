package member;
// join, login 메소드를 만들어 보자.
public interface MemberService {
	public void join(Member member); 		// return을 모를 때엔 일단 void값을 준다.
	public void login();

}
