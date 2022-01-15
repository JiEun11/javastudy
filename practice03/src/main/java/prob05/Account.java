package prob05;

public class Account {
	private String accountNo;		// 계좌 번호
	private int balance;		// 잔고 
	
	Account(String accountNo){
		setAccountNo(accountNo);
		System.out.println(getAccountNo() + " 계좌가 개설되었습니다.");
	}
	
	public void save(int money) {
		balance += money;
		System.out.println(getAccountNo() + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		balance -= money;
		System.out.println(getAccountNo() + " 계좌에 " + money + "만원이 출금되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		this.balance = balance;
	}
	
	
}
