import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        Conversions usdollar = new Conversions();
        double dollarAmount;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available currency's are: Turkey Lira, Vietnam Dong");
        System.out.println("What currency do you want to convert to?");
        String currency;
        currency = scanner.next();

        System.out.println("Please enter dollar amount you want to convert: ");
        dollarAmount = scanner.nextLong();


        switch (currency.toLowerCase()){
            case "lira":
                result = usdollar.usToTurkeyLira(dollarAmount);
                System.out.println("The conversion from $" + dollarAmount + " is about "+  result + " Lira");
                break;
            case "dong":
                result = usdollar.usToVietnamDong(dollarAmount);
                System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Dong");
                break;
            default:
                System.out.println("Invalid Currency");
        }
        scanner.close();
    }//end main method
}//end main class
