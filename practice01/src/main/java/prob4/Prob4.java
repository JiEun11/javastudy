package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		// 배열 생성
		String[] letters = makeArray(text);
		
		// 배열 출력 
		showLetters(letters);
		
		scanner.close();
	}

	private static String[] makeArray(String text) {
		String[] letters2 = new String[text.length()];
		return letters2 = text.split("");
	}

	private static void showLetters(String[] arr) {
		for(int i = 1; i <= arr.length; i++) {
			for(int j = 0 ; j< i ; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
	}

}
