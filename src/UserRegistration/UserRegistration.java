package UserRegistration;

import java.util.Scanner;

public class UserRegistration {
    UserValidation userValidation = new UserValidation();
    Scanner input = new Scanner(System.in);
    String firstName = "";
    String lastName = "";

    /**
     * UserRegistration() - constructor to create object by getting input from user
     * gets user registration details and stores in the variables
     */
    public UserRegistration() {
        System.out.print("Enter First name: ");
        setFirstName(input.nextLine());
        System.out.print("Enter Last name: ");
        setLastName(input.nextLine());
    }

    /**
     * setFirstName - method to set value for firstName variable
     * @param firstName - passes user input to function
     *                  validates it by passing through userValidation object
     *                  and then sets it to firstName variable of this class
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
     *                  and then sets it to firstName variable of this class
     */
    public void setLastName(String lastName) {
        if(userValidation.isLastNameValid(lastName))
            this.lastName = lastName;
        else{
            System.out.print("Please enter last name again: ");
            setLastName(input.nextLine());
        }
    }
}
