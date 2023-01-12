
public class BankAccountTest {
	public static void main(String[] args) {
		AccountInfo accountA = new AccountInfo("1234567","password","ABC");

		accountA.changePassword("password","password2");
		accountA.printInformation("password2");
	}

}
