public class User {
	
	public String username;
	public int age;
	
	public User() {
		this.username = "Janine";
		this.age = 0;
	}
	
	
	public void setUsername(String username) throws InvalidUsernameException{

		    if(this.username.equals(username)) {
				throw new InvalidUsernameException();
			}
			else {
				this.username = username;
			}
	}
	
	public void setAge(int age) throws TooYoungException, InvalidAgeException{
		
		if(age < 13 && age > 0) {
			throw new TooYoungException();	
		}
		else if(age <= 0) {
				throw new InvalidAgeException();
		}
		else {
			this.age = age;
		}
	}
}
