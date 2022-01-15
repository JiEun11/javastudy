package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0 ; i <COUNT_GOODS; i++) {
			System.out.print("product : ");
			String product = scanner.next();
			System.out.print("price : ");
			int price = scanner.nextInt();
			System.out.print("countStock : ");
			int countStock = scanner.nextInt();
			goods[i] = new Goods(product, price, countStock);
		}
		// 상품 출력
		for(Goods stock : goods) {
			System.out.println(stock.toString());
		}
		
		// 자원정리
		scanner.close();
	}
}
