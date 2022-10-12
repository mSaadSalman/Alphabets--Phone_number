Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        
        long number = 0; 



        
        char[] arrayy=initial_phone_number.toCharArray();

        String var="";

        for (int i=0; i<10; i++) {
            if (arrayy[i]=='1'||arrayy[i]=='2'||arrayy[i]=='3'||arrayy[i]=='4'||arrayy[i]=='5'||arrayy[i]=='6'||arrayy[i]=='7'||arrayy[i]=='8'||arrayy[i]=='9'){
                var= var+arrayy[i];
            }
            if (arrayy[i]=='A'||arrayy[i]=='B'||arrayy[i]=='C'){
                var=  var+2;
            }
            if (arrayy[i]=='D'||arrayy[i]=='E'||arrayy[i]=='F'){
                var= var+3;
            }
            if (arrayy[i]=='G'||arrayy[i]=='H'||arrayy[i]=='I'){
                var= var+4;
            }
            if (arrayy[i]=='J'||arrayy[i]=='K'||arrayy[i]=='L'){
                var= var+5;
            }
            if (arrayy[i]=='M'||arrayy[i]=='N'||arrayy[i]=='O'){
                var= var+6;
            }
            if (arrayy[i]=='P'||arrayy[i]=='Q'||arrayy[i]=='R'||arrayy[i]=='S'){
                var= var+7;
            }
            if (arrayy[i]=='T'||arrayy[i]=='U'||arrayy[i]=='V'){
                var= var+8;
            }
            if (arrayy[i]=='W'||arrayy[i]=='X'||arrayy[i]=='Y'||arrayy[i]=='Z'){
                var= var+9;
            }
        }

        number = Long.parseLong(var);

         




        // Return actual number only at the end of the function
        return number;

    }// End of full_number function
}
