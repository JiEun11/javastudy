package prob3;

public class Duck extends Bird {
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.printf("오리(%s)는 날지 않습니다.%n", getName());
	}
	
//	@Override
//	public void sing() {
//		System.out.println(getName() + "가 소리내어 웁니다.");
//	}
	
	@Override
	public String toString() {
		return "오리의 이름은 " + name + "입니다.";
	}
}
