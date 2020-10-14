
public class InvalidUsernameException extends Exception {
	public InvalidUsernameException(){
		super("That username is already taken. Please try again.");
	}
}
