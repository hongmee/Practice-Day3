import java.util.Random;

public class RandomInt {
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(256);
		
		//지연 시간 추가하기
		
		System.out.println("지금 무슨 생각을 하고 있는지 맞춰 볼게요");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(randomNumber);
		
		
		
		
	}
	
	
}
