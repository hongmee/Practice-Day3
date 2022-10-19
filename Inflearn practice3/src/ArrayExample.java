import java.util.Arrays;

public class ArrayExample {

	
	public static void main(String[] args) {
		
		
		
		String[] days= {"월","화","수","목","금","토","일"};
			
		System.out.println(days[0]);
		System.out.println(days[6]);
		
		int lengthOfDays=days.length;
		
		
		
		
		for(String day : days) {
			System.out.println(day+"요일");
		}
		
		
		
		String[] days2=Arrays.copyOf(days,8);
		days2[7]="홍";
		
		System.out.println();
		
		for(String day : days2) {
			System.out.println(day);
		}
		
		
		System.out.println("======================");
		
		
	
	}
}
