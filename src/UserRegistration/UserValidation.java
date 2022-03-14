package UserRegistration;

import java.util.regex.Pattern;

public class UserValidation {

    private boolean validateRegex(String request, String pattern) {
        return Pattern.compile(pattern).matcher(request).matches();
    }

    public boolean isFirstNameValid(String firstName) throws Exception {
        if (validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX)){
            return true;
        } else {
            System.out.println("Invalid first name.");
        }
        return false;
    }

}