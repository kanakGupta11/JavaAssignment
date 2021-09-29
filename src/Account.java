import java.util.Date;

public class Account {
	private String City, state,Ownername;
	private int pin;
	private int BalanceAmount;
	private Date CreatedDate;
	private String AccountStatus ;//ACTIVE,INACTIVE,CLOSED
	public Account(String city, String state, String Ownername, int pin, int BalanceAmount,String AccountStatus) {
		this.City = city;
		this.state = state;
		this.Ownername = Ownername;
		this.pin = pin;
		this.BalanceAmount = BalanceAmount;
		this.CreatedDate = new Date();
		this.AccountStatus = AccountStatus;
	}
	

}
