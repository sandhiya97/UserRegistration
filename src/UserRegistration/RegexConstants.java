package UserRegistration;

/**
 * RegexConstants - class created to store all regex constants
 * which can be used in any classes
 */
public class RegexConstants {

    /*
    Starting letter of first name should be capital letter, so ^[A-Z] is used
    to fetch only one capital letter between A-Z.
    Remaining letters of the name needs to be in small so [a-z] is used.
    As the minimum number of characters need to be 3, {2,} quantifier is used to verify that
    at least 2 letters from [a-z]. It's blank after comma(,) as it's not mentioned with
    maximum character length for first name.
     */
    public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";

    /*
    Starting letter of last name should be capital letter, so ^[A-Z] is used
    to fetch only one capital letter between A-Z.
    Remaining letters of the name needs to be in small so [a-z] is used.
    As the minimum number of characters need to be 3, {2,} quantifier is used to verify that
    at least 2 letters from [a-z]. It's blank after comma(,) as it's not mentioned with
    maximum character length for last name.
     */
    public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";

}