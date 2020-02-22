import java.io.IOException;
import java.util.Scanner;

public class Accounting {
    private float dayHour;
    private float dayPay;

    public void pay() {
        //  The method should accept a number of working  hours and a per hour payment. It should return a calculated payment

        dayHour = enterParam("Please, enter number of working hours: ");
        dayPay = enterParam("Please, enter your payment: ");

        if (dayHour == 0 && dayPay ==0 ) {System.out.println("It seems that you don't have work. Please, visit https://www.epam.com/careers");}
        else if (dayHour == 0) {System.out.println("You have not earn money for asking day. Because you had not worked!");}
        else if (dayPay == 0) {System.out.println("Your payment is 0. Sorry :(");}
        else if (dayPay < 0 || dayHour<0 ) {System.out.println("Note: working hours and/or you payment can't be negative. Please, be attentive!");}
        else System.out.println("For " + dayHour + " working hours you've earned " + payment() + " currencies!");
    }


    private float payment() {
        float payment = dayHour * dayPay;
        return payment;
    }




    //input data
    public static float enterParam(String message) {
        System.out.print(message);
        Scanner s = new Scanner(System.in);
        return Integer.parseInt(s.nextLine());
    }
}
