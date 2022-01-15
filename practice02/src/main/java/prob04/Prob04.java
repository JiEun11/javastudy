package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] charArr = str.toCharArray();
		char[] revArr = new char[charArr.length];
		for(int i = 0; i<charArr.length; i++) {
			revArr[charArr.length-1-i] = charArr[i];
		}
		return revArr;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println( array );
	}
}