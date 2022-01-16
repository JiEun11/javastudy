package prob2;

public class SmartPhone extends MusicPhone {
	
	public void execute(String function) {
		if(function.equals("앱")) {
			app();
		}else {
			super.execute(function);
		}
	}
	public void app() {
		System.out.println("앱실행");
	}
}
