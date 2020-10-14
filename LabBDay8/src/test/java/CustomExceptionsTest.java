import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CustomExceptionsTest {
	
	User user;
	
	@BeforeEach
	void setUp() {
		user = new User();
	}
	
	@DisplayName("Testing Username Verification")
	@Test
	void testSetUsernameVerification() {
		assertThrows(InvalidUsernameException.class, () -> user.setUsername("Janine"), "Should throw Invalid Username Exception");
	}
	
	@DisplayName("Testing Age Over 13 Verification")
	@Test
	void testSetAgeLimit() {
		assertThrows(TooYoungException.class, () -> user.setAge(10), "Should throw Too Young Exception");
	}
	
	@DisplayName("Testing Positive Age Verification")
	@Test
	void testSetAgePositive() {
		assertThrows(InvalidAgeException.class, () -> user.setAge(-1), "Should throw Invalid Age Exception");
	}

}
