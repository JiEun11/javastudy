package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int result = 0;
		result = sumNums(num);
		
		System.out.println("결과값 : " + result);
		scanner.close();
	}

	private static int sumNums(int num) {
		int sum = 0;
		
		if(num%2==1) {	// num이 홀수 일 때 
			for(int i = 1; i<= num; i += 2) {
				sum += i;
			}
			
		}else {		// num이 짝수 일 때 
			for(int i = 0; i<= num; i += 2) {
				sum += i;
			}
		}
		return sum;
	}
}
