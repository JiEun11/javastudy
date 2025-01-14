package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 10 - a;

		System.out.println("some code1...");

		try {
			System.out.println("some code2...");
			int result = (1 + 2 + 3) / b;
			System.out.println("some code3...");
		} catch (ArithmeticException e) {
			/* 예외 처리 */
			
			// 1. 사과 
			System.out.println("s o r r y");
			// 2. 로깅 
			System.out.println("error: " + e);
			// 3. 정상 종료 
			return ;
			
			
		}	finally {
			/* 자원 정리 */
			System.out.println("자원 정리");
		}

	}

}
