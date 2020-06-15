package member;
/* 요구사항 (기능정의)
* <사용자기능>
* 1. 회원가입
* 2. 마이페이지
* 3. 비번 수정
* 4. 회원탈퇴
* 5. 아이디 존재 체크
* 6. 로그인
* **********
* <관리자기능>
* 7. 회원목록
* 8. 아이디검색
* 9. 이름검색
* 10. 전체 회원수
**/
public interface MemberService {
	public void join(Member member); 		// return을 모를 때엔 일단 void값을 준다.
	public String login(Member member);
	public Member[] list();
	public String yesId(Member member);		// 추상화

}
