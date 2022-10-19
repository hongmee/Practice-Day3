import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
		String password = "hongmee";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("비밀번호를 입력해 사용자를 인증하세요");
			String input = scanner.nextLine();
			
			if(input.equals(password)) {
				System.out.println("인증 완료");
				break;
			}
			
			System.out.println("인증 실패");
		}
	}
}
