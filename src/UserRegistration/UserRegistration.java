package UserRegistration;

import java.util.Scanner;

public class UserRegistration {

    UserValidation userValidation = new UserValidation();
    Scanner input = new Scanner(System.in);
    String firstName = "";
    String lastName = "";
    String email = "";
    String phoneNumber = "";
    String password = "";

    /**
     * UserRegistration() - constructor to create object by getting input from user
     * gets user registration details and stores in the variables
     */
    public UserRegistration() {

        System.out.print("Enter First name: ");
        setFirstName(input.nextLine());

        System.out.print("Enter Last name: ");
        setLastName(input.nextLine());

        System.out.print("Enter email address: ");
        setEmail(input.nextLine());

        System.out.print("Enter phone number: ");
        setPhoneNumber(input.nextLine());

        System.out.print("Enter password: ");
        setPassword(input.nextLine());
    }

    /**
     * setFirstName - method to set value for firstName variable
     * @param firstName - passes user input to function
     *                  validates it by passing through userValidation object
     *                  and then sets it to firstName variable of this class
     *                  else asks to enter the first name again
     */
    public void setFirstName(String firstName) {
        if(userValidation.isFirstNameValid(firstName))
            this.firstName = firstName;
        else{
            System.out.print("Please enter first name again: ");
            setFirstName(input.nextLine());
        }
    }

    /**
     *
     * setLastName - method to set value for lastName variable
     * @param lastName - passes user input to function
     *                  validates it by passing through userValidation object
     *                  and then sets it to lastName variable of this class
     *                 else asks to enter last name again
     */
    public void setLastName(String lastName) {
        if(userValidation.isLastNameValid(lastName))
            this.lastName = lastName;
        else{
            System.out.print("Please enter last name again: ");
            setLastName(input.nextLine());
        }
    }

    /**
     * setEmail - method to set value for email variable
     * @param email - passes user email to function
     *              validates it by passing through userValidation object
     *              and then sets it to email variable of this class
     *              else asks to enter email again
     */
    public void setEmail(String email) {
        if(userValidation.isEmailValid(email))
            this.email = email;
        else{
            System.out.print("Please enter email again: ");
            setEmail(input.nextLine());
        }
    }

    /**
     * setPhoneNumber - method to set value for phoneNumber variable
     * @param phoneNumber - passes user phone number to function
     *              validates it by passing through userValidation object
     *              and then sets it to phoneNumber variable of this class
     *              else asks to enter phone number again
     */
    public void setPhoneNumber(String phoneNumber) {
        if (userValidation.isPhoneNumberValid(phoneNumber))
           this.phoneNumber = phoneNumber;
        else{
            System.out.print("Please enter phone number again: ");
            setPhoneNumber(input.nextLine());
        }
    }

    /**
     * setPassword - method to set value for password variable
     * @param password - passes user password to function
     *              validates it by passing through userValidation object
     *              and then sets it to password variable of this class
     *              else asks to enter password again
     */
    public void setPassword(String password) {
        if (userValidation.isPasswordValid(password))
            this.password = password;
        else {
            System.out.print("Please enter password again: ");
            setPhoneNumber(input.nextLine());
        }
    }
}