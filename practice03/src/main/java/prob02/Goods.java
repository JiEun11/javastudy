package prob02;

public class Goods {
	private String product;
	private int price;
	private int countStock;
	
	Goods(String product, int price, int countStock){
		this.product = product;
		this.price = price;
		this.countStock = countStock;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getcountStock() {
		return countStock;
	}
	public void setcountStock(int countStock) {
		this.countStock = countStock;
	}

	@Override
	public String toString() {
		return product + "(가격: "+ price + "원)(이)가 " + countStock + "개 입고 되었습니다. ";
	}
	
	
}
