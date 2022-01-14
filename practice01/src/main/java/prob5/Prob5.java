package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		
		for(int i=1; i <= 99; i++) {
			int count = 0 ; // 3, 6, 9의 개수를 세어 주는 
			int temp = i;
			int check = 0;
			boolean flag = false;

			while(temp > 0) {
				check = temp % 10;
				temp /= 10;
				if(check % 3 == 0 && check != 0) {
					count ++;
					flag = true;
				}
			}
			if(flag) {
				System.out.print(i);
				System.out.print(" ");
				for(int j=0; j<count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
	
	
}
