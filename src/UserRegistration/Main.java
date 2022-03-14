package UserRegistration;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
	    UserValidation userValidation = new UserValidation();
        Scanner input = new Scanner(System.in);
        String firstName = "";

        System.out.print("Enter First Name: ");
        if(userValidation.isFirstNameValid(input.nextLine())){
            firstName = input.nextLine();
        }

    }
}
