import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	
	public static void main(String[] args) {
		
		System.out.println("지금부터 255 이하의 숫자를 하나 생각하겠습니다.");
		System.out.println("8번의 기회 안에, 제가 뽑은 숫자를 맞춰보세요!");
		
		Random rd = new Random();
		int rdNumber = rd.nextInt(256);
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < 8 ; i++) {
			System.out.println(8-i+"번의 기회가 있습니다. 숫자를 입력하세요");
			
			String input = scanner.nextLine(); // 예외처리가 있으면 좋다
			int guess = Integer.parseInt(input); 
			
			if(rdNumber == guess) {
				System.out.println("대단해요! 정답입니다");
				break;
			}
			
			
			else if (rdNumber < guess) {
				System.out.println("정답보다 큰 숫자입니다.");
			}else {
				System.out.println("정답보다 작은 숫자입니다.");
			}
			
			if(i==7) {
				System.out.println("더 이상 기회가 남지 않았습니다");
			}
			
		}
		
		System.out.println("게임을 종료합니다 ^^");
	}
}
