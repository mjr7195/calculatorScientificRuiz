import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available currency: Dollar, Lira, Pound, Dong, Krona, Franc, Riyal, Rand, Rupee");
        System.out.println("What currency do you want to start with?");
        String startingCurrency = scanner.next().toLowerCase();

        while (!startingCurrency.equals("dollar") && !startingCurrency.equals("lira") && !startingCurrency.equals("pound") && !startingCurrency.equals("dong") && !startingCurrency.equals("krona") && !startingCurrency.equals("franc") && !startingCurrency.equals("riyal") && !startingCurrency.equals("rand") && !startingCurrency.equals("rupee")){ // to be corrected
            System.out.println("Available currency: Dollar, Lira, Pound, Dong, Krona, Franc, Riyal, Rand, Rupee");
            System.out.println("Please choose a valid currency from list above: ");
            startingCurrency = scanner.next().toLowerCase();
        }

        if (startingCurrency.equals("dollar")) {
            double dollarAmount;

            System.out.println("Available currency's are: Lira, Dong, Pound, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter dollar amount you want to convert: ");
            dollarAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "lira":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToTurkeyLira(dollarAmount) + " Lira");
                    break;
                case "dong":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToVietnamDong(dollarAmount) + " Dong");
                    break;
                case "pound":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToUKPound(dollarAmount) + " Pound(s)");
                    break;
                case "krona":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToSwedenKrona(dollarAmount) + " Krona");
                    break;
                case "franc":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToSwissFranc(dollarAmount) + " Franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToSaudiRiyal(dollarAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToSouthAfricanRand(dollarAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from $" + dollarAmount + " is about " + Conversion.usToNepalRupee(dollarAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end dollar switch

        }//end if dollar

        if (startingCurrency.equals("lira")) { // start lira if
            double liraAmount;

            System.out.println("Available currency's are: Dollar, Dong, Pound, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter lira amount you want to convert: ");
            liraAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + liraAmount + " Lira is about " + Conversion.liraToUSDollar(liraAmount) + " Dollars");
                    break;
                case "dong":
                    System.out.println("The conversion from " + liraAmount + " lira is about " + Conversion.liraToVietnamDong(liraAmount) + " Dong");
                    break;
                case "pound":
                    System.out.println("The conversion from " + liraAmount + " lira is about " + Conversion.liraToUKPound(liraAmount) + " Pound(s)");
                    break;
                case "krona":
                    System.out.println("The conversion from " + liraAmount + " lira is about " + Conversion.liraToSwedenKrona(liraAmount) + " Krona");
                    break;
                case "franc":
                    System.out.println("The conversion from " + liraAmount + " lira is about " + Conversion.liraToSwissFranc(liraAmount) + " Franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + liraAmount + " is about " + Conversion.liraToSaudiRiyal(liraAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + liraAmount + " is about " + Conversion.liraToSouthAfricanRand(liraAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + liraAmount + " is about " + Conversion.liraToNepalRupee(liraAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end lira switch

        }//end if lira

        if (startingCurrency.equals("pound")) { // start pound if
            double poundAmount;

            System.out.println("Available currency's are: Dollar, Dong, Lira, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter pound amount you want to convert: ");
            poundAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToUSDollar(poundAmount) + " Dollars");
                    break;
                case "dong":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToVietnamDong(poundAmount) + " Dong");
                    break;
                case "lira":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToTurkeyLira(poundAmount) + " Lira");
                    break;
                case "krona":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToSwedenKrona(poundAmount) + " Krona");
                    break;
                case "franc":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToSwissFranc(poundAmount) + " Franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToSaudiRiyal(poundAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + Conversion.poundToSouthAfricanRand(poundAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + poundAmount + " is about " + Conversion.poundToNepalRupee(poundAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end pound switch

        }//end if pound

        if (startingCurrency.equals("dong")) { // start dong if
            double dongAmount;

            System.out.println("Available currency's are: Dollar, Lira, Pound, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter dong amount you want to convert: ");
            dongAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToUSDollar(dongAmount) + " Dollars");
                    break;
                case "pound":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToUKPound(dongAmount) + " Dong");
                    break;
                case "lira":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToTurkeyLira(dongAmount) + " Lira");
                    break;
                case "krona":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToSwedenKrona(dongAmount) + " Krona");
                    break;
                case "franc":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToSwissFranc(dongAmount) + " Franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToSaudiRiyal(dongAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToSouthAfricanRand(dongAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + dongAmount + " dong is about " + Conversion.dongToNepalRupee(dongAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end pound switch

        }//end if pound


        if (startingCurrency.equals("krona")) { // start krone if
            double kronaAmount;

            System.out.println("Available currency's are: Dollar, Lira, Dong, Pound, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter krona amount you want to convert: ");
            kronaAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kronaToUSDollar(kronaAmount) + " Dollars");
                    break;
                case "pound":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kronaToUKPound(kronaAmount) + " Dong");
                    break;
                case "lira":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kronaToTurkeyLira(kronaAmount) + " Lira");
                    break;
                case "dong":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kronaToVietnamDong(kronaAmount) + " dong");
                    break;
                case "franc":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kroneToSwissFranc(kronaAmount) + " Franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kroneToSaudiRiyal(kronaAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kroneToSouthAfricanRand(kronaAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + Conversion.kroneToNepalRupee(kronaAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end krona switch

        }//end if króna

        if (startingCurrency.equals("franc")) { // start franc if
            double francAmount;

            System.out.println("Available currency's are: Dollar, Lira, Dong, Krona, Pound, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter franc amount you want to convert: ");
            francAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToUSDollar(francAmount) + " Dollars");
                    break;
                case "pound":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToUKPound(francAmount) + " Dong");
                    break;
                case "lira":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToTurkeyLira(francAmount) + " Lira");
                    break;
                case "dong":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToVietnamDong(francAmount) + " dong");
                    break;
                case "krona":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToSwedenKrona(francAmount) + " krona");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToSaudiRiyal(francAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToSouthAfricanRand(francAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + francAmount + " franc is about " + Conversion.francToNepalRupee(francAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end franc switch

        }//end if franc

        if (startingCurrency.equals("riyal")) { // start krone if
            double riyalAmount;

            System.out.println("Available currency's are: Dollar, Lira, Krona, Franc, Dong, Pound, " +
                    " Rand and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter riyal amount you want to convert: ");
            riyalAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToUSDollar(riyalAmount) + " Dollars");
                    break;
                case "pound":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToUKPound(riyalAmount) + " Dong");
                    break;
                case "lira":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToTurkeyLira(riyalAmount) + " Lira");
                    break;
                case "dong":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToVietnamDong(riyalAmount) + " dong");
                    break;
                case "krona":

                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToSwedenKrona(riyalAmount) + " krona");
                    break;
                case "franc":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToSwissFranc(riyalAmount) + " franc(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToSouthAfricanRand(riyalAmount) + " Rand(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + Conversion.riyalToNepalRupee(riyalAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end riyal switch

        }//end if riyal

        if (startingCurrency.equals("rand")) { // start krone if
            double randAmount;

            System.out.println("Available currency's are: Dollar, Dong, Pound, " +
                    " Krone, Riyal, Lira, Franc and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter rand amount you want to convert: ");
            randAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToUSDollar(randAmount) + " Dollars");
                    break;
                case "pound":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToUSDollar(randAmount) + " Dong");
                    break;
                case "lira":

                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToTurkeyLira(randAmount) + " Lira");
                    break;
                case "dong":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToVietnamDong(randAmount) + " dong");
                    break;
                case "krona":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToSwedenKrona(randAmount) + " krona");
                    break;
                case "franc":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToSwissFranc(randAmount) + " franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToSaudiRiyal(randAmount) + " Riyal(s)");
                    break;
                case "rupee":
                    System.out.println("The conversion from " + randAmount + " rand is about " + Conversion.randToNepalRupee(randAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end rand switch

        }//end if rand

        if (startingCurrency.equals("rupee")) { // start rupee if
            double rupeeAmount;

            System.out.println("Available currency's are: Dollar, Dong, Pound, " +
                    " Krone, Riyal, Lira, Franc and Rand.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter rupee amount you want to convert: ");
            rupeeAmount = scanner.nextDouble();

            switch (currency.toLowerCase()) {
                case "dollar":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToUSDollar(rupeeAmount) + " Dollars");
                    break;
                case "pound":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToUKPound(rupeeAmount) + " Dong");
                    break;
                case "lira":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToTurkeyLira(rupeeAmount) + " Lira");
                    break;
                case "dong":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToVietnamDong(rupeeAmount) + " dong");
                    break;
                case "krona":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToSwedenKrona(rupeeAmount) + " krona");
                    break;
                case "franc":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToSwissFranc(rupeeAmount) + " franc(s)");
                    break;
                case "riyal":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToSaudiRiyal(rupeeAmount) + " Riyal(s)");
                    break;
                case "rand":
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + Conversion.rupeeToSouthAfricanRand(rupeeAmount) + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end rand switch

        }//end if rand
        scanner.close();
    }//end main method
}//end main class
