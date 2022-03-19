package UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationTest {

    UserValidation user = new UserValidation();

    @org.junit.jupiter.api.Test
    public void testFirstName_thenAssertionSucceeds() {
            assertTrue(user.isFirstNameValid("Sandhiya"));
            System.out.println("Valid First Name");
    }

    @org.junit.jupiter.api.Test
    public void testFirstName_thenAssertionFail() {
        assertFalse(user.isFirstNameValid("Sandhiya"));
        System.out.println("InvalidValid First Name");
    }

    @org.junit.jupiter.api.Test
    public void testLastName_thenAssertionSucceeds() {
        assertTrue(user.isLastNameValid("Babu"));
        System.out.println("Valid Last Name");
    }

    @org.junit.jupiter.api.Test
    public void testLastName_thenAssertionFail() {
        assertFalse(user.isLastNameValid("Babu"));
        System.out.println("Invalid Last Name");
    }

    @org.junit.jupiter.api.Test
    public void testEmail_thenAssertionSucceeds() {
        assertTrue(user.isEmailValid("abc@gmail.com"));
        System.out.println("Valid Email");
    }

    @org.junit.jupiter.api.Test
    public void testEmail_thenAssertionFail() {
        assertFalse(user.isEmailValid("abc@gmail@.com@"));
        System.out.println("Invalid Email");
    }

    @org.junit.jupiter.api.Test
    public void testMobileNumber_thenAssertionSucceeds() {
        assertTrue(user.isPhoneNumberValid("91 9876543210"));
        System.out.println("Valid Mobile Number");
    }

    @org.junit.jupiter.api.Test
    public void testMobileNumber_thenAssertionFail() {
        assertFalse(user.isPhoneNumberValid("910876543210"));
        System.out.println("Invalid Mobile Number");
    }

    @org.junit.jupiter.api.Test
    public void testPassword_thenAssertionSucceeds() {
        assertTrue(user.isPasswordValid("Abcd@1234"));
        System.out.println("Valid Password");
    }

    @org.junit.jupiter.api.Test
    public void testPassword_thenAssertionFail() {
        assertFalse(user.isPasswordValid("bbb"));
        System.out.println("Invalid Password");
    }

}
