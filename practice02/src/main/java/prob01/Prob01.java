package prob01;

import java.util.Arrays;
import java.util.Scanner;

public class Prob01 {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		/* 코드 작성 */
		System.out.print("금액: " );
		int money = scanner.nextInt();
		
		payCount(money,MONEYS);
		
		scanner.close();
 	}
	
		public static void payCount(int money, int[] MONEYS) {
			int[] moneyCount = new int[MONEYS.length];
			
			for(int i = 0; i < 10 ; i ++) {
				if(money/MONEYS[i]>=1) {
					moneyCount[i] = money/MONEYS[i];
					money = money - (MONEYS[i] * moneyCount[i]);
				}
//				System.out.println(Arrays.toString(moneyCount));
			}
			for(int i = 0; i< 10 ; i++) {
				System.out.println(MONEYS[i] + "원 : " + moneyCount[i]+"개");
			}
			
		}
		
	
}