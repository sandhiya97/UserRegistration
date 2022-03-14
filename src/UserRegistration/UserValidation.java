package UserRegistration;

import java.util.regex.Pattern;

public class UserValidation {
    /**
     * validateRegex - method to check the pattern of regex with provided input
     *
     * @param request - input data to be checked with the pattern
     * @param pattern - regex that needs to be matched with input
     * @return - returns boolean value to the condition from where it's called.
     */
    private boolean validateRegex(String request, String pattern) {
        return Pattern.compile(pattern).matcher(request).matches();
    }

    /**
     * isFirstNameValid - method to check validity of first name
     *
     * @param firstName - user input data
     * @return - boolean value if first name matches with its regex condition
     */
    public boolean isFirstNameValid(String firstName){

        /*
        validateRegex function is called by passing first name user input
        and first name regex pattern stored in RegexConstants class
         */
        if (validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX)){
            return true;
        } else {
            System.out.println("Invalid first name.");
        }
        return false;
    }

    /**
     * isLastNameValid - method to check validity of last name
     *
     * @param lastName - user input data
     * @return - boolean value if first name matches with its regex condition
     */
    public boolean isLastNameValid(String lastName){
        /*
        validateRegex function is called by passing last name user input
        and last name regex pattern stored in RegexConstants class
         */
        if (validateRegex(lastName, RegexConstants.LAST_NAME_REGEX)){
            return true;
        } else {
            System.out.println("Invalid last name.");
        }
        return false;
    }
}