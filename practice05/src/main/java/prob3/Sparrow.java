package prob3;

public class Sparrow extends Bird {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public void fly() {
		System.out.printf("참새(%s)는 날아다닙니다.%n", getName());
	}
	
//	@Override
//	public void sing() {
//		System.out.println(getName()+"가 소리내어 웁니다.");
//	}
	
	@Override
	public String toString() {
		return "참새의 이름은 " + name + "입니다.";
	}
	
	
	
}
