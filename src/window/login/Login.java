package window.login;

public class Login {
	public static boolean authenticate(String username, String password) {
		// hardcoded username and password
		if (username.equals("bob") && password.equals("secret")) {
			return true;
		}
			else if (username.equals("michail") && password.equals("samsonas")){
				return true;
			}
			else
		return false;
	}
}