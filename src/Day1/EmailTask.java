package Day1;

import java.util.Scanner;

import static java.lang.System.in;

public class EmailTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        String email = input.next();

        String lastName = email.substring(0,email.indexOf("_"));

        String firstName = email.substring(email.indexOf("_") + 1,email.indexOf("@"));

        String domain = email.substring(email.indexOf("@") + 1,email.indexOf("."));

        String rest = email.substring(email.indexOf("@"));


        System.out.println(firstName + "_" + lastName + rest );

        System.out.println("First name: " + firstName.substring(0,1).toUpperCase()
                + firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase()
                + lastName.substring(1));
        System.out.println("Domain: " + domain);









    }
}
/*
Assume that email address is constructed by person's last name and followed
by an underscore and first name.

input: tyson_mike@gmail.com
Output: mike_tyson@gmail.com

Print first name, last name, and domain.

First and Last name should be printed with proper
format - uppercase first letter and remaining lowercase.


 */