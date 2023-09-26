import java.util.Scanner;
import java.lang.Math;
public class Main {
    /* methods to calculate US Dollar conversions */
    public static double usToTurkeyLira(double bucks) {
        double exchangeRate = 27.22;
        return Math.multiplyExact((int) bucks, (int) exchangeRate);
    }

    public static double usToVietnamDong(double bucks) {
        double exchangeRate = 24395.00;
        return Math.multiplyExact((int) bucks, (int) exchangeRate);
    }

    public static double usToUKPound(double bucks) {
        double exchangeRate = .82;
        return bucks * exchangeRate;
    }

    public static double usToSwedenKrona(double bucks) {
        double exchangeRate = 11.03;
        return bucks * exchangeRate;
    }

    public static double usToSwissFranc(double bucks) {
        double exchangeRate = .92;
        return bucks * exchangeRate;
    }

    public static double usToSaudiRiyal(double bucks) {
        double exchangeRate = 3.75;
        return bucks * exchangeRate;
    }

    public static double usToSouthAfricanRand(double bucks) {
        double exchangeRate = 19.09;
        return bucks * exchangeRate;
    }

    public static double usToNepalRupee(double bucks) {
        double exchangeRate = 113.13;
        return bucks * exchangeRate;
    }
    /* ************************** end dollar conversions **********************************/

    /* ************************** pound conversions************************************ */
    public static double poundToUSDollar(double pound) {
        double exchangeRate = 1.22;
        return pound * exchangeRate;
    }

    public static double poundToVietnamDong(double pound) {
        double exchangeRate = 29654.44;
        return pound * exchangeRate;
    }

    public static double poundToTurkeyLira(double pound) {
        double exchangeRate = 33.14;
        return pound * exchangeRate;
    }

    public static double poundToSwedenKrona(double pound) {
        double exchangeRate = 13.38;
        return pound * exchangeRate;
    }

    public static double poundToSwissFranc(double pound) {
        double exchangeRate = 1.11;
        return pound * exchangeRate;
    }

    public static double poundToSaudiRiyal(double pound) {
        double exchangeRate = 4.56;
        return pound * exchangeRate;
    }

    public static double poundToSouthAfricanRand(double pound) {
        double exchangeRate = 23.19;
        return pound * exchangeRate;
    }

    public static double poundToNepalRupee(double pound) {
        double exchangeRate = 4.88;
        return pound * exchangeRate;
    }

    /* *************** end pound conversions ***************** */
    /* *************** lira conversions *********************8 */
    public static double liraToUSDollar(double lira) {
        double exchangeRate = .037;
        return lira * exchangeRate;
    }

    public static double liraToVietnamDong(double lira) {
        double exchangeRate = 894.64;
        return lira * exchangeRate;
    }

    public static double liraToUKPound(double lira) {
        double exchangeRate = .030;
        return lira * exchangeRate;
    }

    public static double liraToSwedenKrona(double lira) {
        double exchangeRate = .40;
        return lira * exchangeRate;
    }

    public static double liraToSwissFranc(double lira) {
        double exchangeRate = .034;
        return lira * exchangeRate;
    }

    public static double liraToSaudiRiyal(double lira) {
        double exchangeRate = .14;
        return lira * exchangeRate;
    }

    public static double liraToSouthAfricanRand(double lira) {
        double exchangeRate = .70;
        return lira * exchangeRate;
    }

    public static double liraToNepalRupee(double lira) {
        double exchangeRate = 4.88;
        return lira * exchangeRate;
    }
    /* end lira conversions*/
    // start dong conversions
    public static double dongToUSDollar(double dong) {
        double exchangeRate = .000041;
        return dong * exchangeRate;
    }

    public static double dongToUKPound(double dong) {
        double exchangeRate = .000034;
        return dong * exchangeRate;
    }

    public static double dongToTurkeyLira(double dong) {
        double exchangeRate = .0011;
        return dong * exchangeRate;
    }

    public static double dongToSwedenKrona(double dong) {
        double exchangeRate = .00045;
        return dong * exchangeRate;
    }

    public static double dongToSwissFranc(double dong) {
        double exchangeRate = .000038;
        return dong * exchangeRate;
    }

    public static double dongToSaudiRiyal(double dong) {
        double exchangeRate = .00015;
        return dong * exchangeRate;
    }

    public static double dongToSouthAfricanRand(double dong) {
        double exchangeRate = .00078;
        return dong * exchangeRate;
    }

    public static double dongToNepalRupee(double dong) {
        double exchangeRate = .0055;
        return dong * exchangeRate;
    }
    // end dong conversion
    // start franc conversion
    public static double francToUSDollar(double franc) {
        double exchangeRate = 1.09;
        return franc * exchangeRate;
    }

    public static double francToUKPound(double franc) {
        double exchangeRate = .90;
        return franc * exchangeRate;
    }

    public static double francToTurkeyLira(double franc) {
        double exchangeRate = 29.76;
        return franc * exchangeRate;
    }

    public static double francToVietnamDong(double franc) {
        double exchangeRate = 26626.05;
        return franc * exchangeRate;
    }

    public static double francToSwedenKrona(double franc) {
        double exchangeRate = 12.01;
        return franc * exchangeRate;
    }

    public static double francToSaudiRiyal(double franc) {
        double exchangeRate = 4.10;
        return franc * exchangeRate;
    }

    public static double francToSouthAfricanRand(double franc) {
        double exchangeRate = 20.80;
        return franc * exchangeRate;
    }

    public static double francToNepalRupee(double franc) {
        double exchangeRate = 145.42;
        return franc * exchangeRate;
    }
    // end franc conversions
    //start krona conversions
    public static double kronaToUSDollar(double krona) {
        double exchangeRate = .091;
        return krona * exchangeRate;
    }

    public static double kronaToUKPound(double krona) {
        double exchangeRate = .075;
        return krona * exchangeRate;
    }

    public static double kronaToTurkeyLira(double krona) {
        double exchangeRate = 2.48;
        return krona * exchangeRate;
    }

    public static double kronaToVietnamDong(double krona) {
        double exchangeRate = 2216.23;
        return krona * exchangeRate;
    }

    public static double kroneToSwissFranc(double krona) {
        double exchangeRate = .083;
        return krona * exchangeRate;
    }

    public static double kroneToSaudiRiyal(double krona) {
        double exchangeRate = 0.34;
        return krona * exchangeRate;
    }

    public static double kroneToSouthAfricanRand(double krona) {
        double exchangeRate = 1.73;
        return krona * exchangeRate;
    }

    public static double kroneToNepalRupee(double krona) {
        double exchangeRate = 12.10;
        return krona * exchangeRate;
    }
    // end krona conversion
    // start riyal conversions
    public static double riyalToUSDollar(double riyal) {
        double exchangeRate = .27;
        return riyal * exchangeRate;
    }

    public static double riyalToUKPound(double riyal) {
        double exchangeRate = 0.22;
        return riyal * exchangeRate;
    }

    public static double riyalToTurkeyLira(double riyal) {
        double exchangeRate = 7.27;
        return riyal * exchangeRate;
    }

    public static double riyalToVietnamDong(double riyal) {
        double exchangeRate = 6500.80;
        return riyal * exchangeRate;
    }

    public static double riyalToSwissFranc(double riyal) {
        double exchangeRate = .24;
        return riyal * exchangeRate;
    }

    public static double riyalToSwedenKrona(double riyal) {
        double exchangeRate = 2.93;
        return riyal * exchangeRate;
    }

    public static double riyalToSouthAfricanRand(double riyal) {
        double exchangeRate = 5.08;
        return riyal * exchangeRate;
    }

    public static double riyalToNepalRupee(double riyal) {
        double exchangeRate = 35.49;
        return riyal * exchangeRate;
    }
    //end riyal conversion
    // start rand conversion
    public static double randToUSDollar(double rand) {
        double exchangeRate = .052;
        return rand * exchangeRate;
    }

    public static double randToUKPound(double rand) {
        double exchangeRate = .043;
        return rand * exchangeRate;
    }

    public static double randToTurkeyLira(double rand) {
        double exchangeRate = 1.43;
        return rand * exchangeRate;
    }

    public static double randToVietnamDong(double rand) {
        double exchangeRate = 1279.42;
        return rand * exchangeRate;
    }

    public static double randToSwissFranc(double rand) {
        double exchangeRate = .048;
        return rand * exchangeRate;
    }

    public static double randToSwedenKrona(double rand) {
        double exchangeRate = .58;
        return rand * exchangeRate;
    }

    public static double randToSaudiRiyal(double rand) {
        double exchangeRate = .20;
        return rand * exchangeRate;
    }

    public static double randToNepalRupee(double rand) {
        double exchangeRate = 6.99;
        return rand * exchangeRate;
    }
    // end rand conversions
    // start rupee conversions
    public static double rupeeToUSDollar(double rupee) {
        double exchangeRate = .0075;
        return rupee * exchangeRate;
    }

    public static double rupeeToUKPound(double rupee) {
        double exchangeRate = .0062;
        return rupee * exchangeRate;
    }

    public static double rupeeToTurkeyLira(double rupee) {
        double exchangeRate = .20;
        return rupee * exchangeRate;
    }

    public static double rupeeToVietnamDong(double rupee) {
        double exchangeRate = 183.19;
        return rupee * exchangeRate;
    }

    public static double rupeeToSwissFranc(double rupee) {
        double exchangeRate = .0069;
        return rupee * exchangeRate;
    }

    public static double rupeeToSwedenKrona(double rupee) {
        double exchangeRate = .083;
        return rupee * exchangeRate;
    }

    public static double rupeeToSaudiRiyal(double rupee) {
        double exchangeRate = .028;
        return rupee * exchangeRate;
    }

    public static double rupeeToSouthAfricanRand(double rupee) {
        double exchangeRate = .14;
        return rupee * exchangeRate;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available currency: Dollar, Lira, Pound, Dong, Krona, Franc, Riyal, Rand, Rupee");
        System.out.println("What currency do you want to start with?");
        String startingCurrency = scanner.next();

        if (startingCurrency.equalsIgnoreCase("dollar")) {
            double dollarAmount;
            double result;


            System.out.println("Available currency's are: Lira, Dong, Pound, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter dollar amount you want to convert: ");
            dollarAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "lira":
                    result = usToTurkeyLira(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Lira");
                    break;
                case "dong":
                    result = usToVietnamDong(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Dong");
                    break;
                case "pound":
                    result = usToUKPound(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Pound(s)");
                    break;
                case "krona":
                    result = usToSwedenKrona(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Krona");
                    break;
                case "franc":
                    result = usToSwissFranc(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Franc(s)");
                    break;
                case "riyal":
                    result = usToSaudiRiyal(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = usToSouthAfricanRand(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = usToNepalRupee(dollarAmount);
                    System.out.println("The conversion from $" + dollarAmount + " is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end dollar switch

        }//end if dollar

        if (startingCurrency.equalsIgnoreCase("lira")) { // start lira if
            double liraAmount;
            double result;


            System.out.println("Available currency's are: Dollar, Dong, Pound, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter lira amount you want to convert: ");
            liraAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = liraToUSDollar(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " Lira is about " + result + " Dollars");
                    break;
                case "dong":
                    result = liraToVietnamDong(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " lira is about " + result + " Dong");
                    break;
                case "pound":
                    result = liraToUKPound(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " lira is about " + result + " Pound(s)");
                    break;
                case "krona":
                    result = liraToSwedenKrona(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " lira is about " + result + " Krona");
                    break;
                case "franc":
                    result = liraToSwissFranc(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " lira is about " + result + " Franc(s)");
                    break;
                case "riyal":
                    result = liraToSaudiRiyal(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = liraToSouthAfricanRand(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = liraToNepalRupee(liraAmount);
                    System.out.println("The conversion from " + liraAmount + " is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end lira switch

        }//end if lira

        if (startingCurrency.equalsIgnoreCase("pound")) { // start pound if
            double poundAmount;
            double result;


            System.out.println("Available currency's are: Dollar, Dong, Lira, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter pound amount you want to convert: ");
            poundAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = poundToUSDollar(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Dollars");
                    break;
                case "dong":
                    result = poundToVietnamDong(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Dong");
                    break;
                case "lira":
                    result = poundToTurkeyLira(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Lira");
                    break;
                case "krona":
                    result = poundToSwedenKrona(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Krona");
                    break;
                case "franc":
                    result = poundToSwissFranc(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Franc(s)");
                    break;
                case "riyal":
                    result = poundToSaudiRiyal(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = poundToSouthAfricanRand(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " pounds is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = poundToNepalRupee(poundAmount);
                    System.out.println("The conversion from " + poundAmount + " is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end pound switch

        }//end if pound

        if (startingCurrency.equalsIgnoreCase("dong")) { // start dong if
            double dongAmount;
            double result;


            System.out.println("Available currency's are: Dollar, Lira, Pound, Krona, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter dong amount you want to convert: ");
            dongAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = dongToUSDollar(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Dollars");
                    break;
                case "pound":
                    result = dongToUKPound(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Dong");
                    break;
                case "lira":
                    result = dongToTurkeyLira(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Lira");
                    break;
                case "krona":
                    result = dongToSwedenKrona(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Krona");
                    break;
                case "franc":
                    result = dongToSwissFranc(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Franc(s)");
                    break;
                case "riyal":
                    result = dongToSaudiRiyal(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = dongToSouthAfricanRand(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = dongToNepalRupee(dongAmount);
                    System.out.println("The conversion from " + dongAmount + " dong is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end pound switch

        }//end if pound


        if (startingCurrency.equalsIgnoreCase("krona")) { // start krone if
            double kronaAmount;
            double result;

            System.out.println("Available currency's are: Dollar, Lira, Dong, Pound, Franc, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter krona amount you want to convert: ");
            kronaAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = kronaToUSDollar(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Dollars");
                    break;
                case "pound":
                    result = kronaToUKPound(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Dong");
                    break;
                case "lira":
                    result = kronaToTurkeyLira(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Lira");
                    break;
                case "dong":
                    result = kronaToVietnamDong(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " dong");
                    break;
                case "franc":
                    result = kroneToSwissFranc(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Franc(s)");
                    break;
                case "riyal":
                    result = kroneToSaudiRiyal(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = kroneToSouthAfricanRand(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = kroneToNepalRupee(kronaAmount);
                    System.out.println("The conversion from " + kronaAmount + " krona is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end krona switch

        }//end if króna

        if (startingCurrency.equalsIgnoreCase("franc")) { // start franc if
            double francAmount;
            double result;

            System.out.println("Available currency's are: Dollar, Lira, Dong, Krona, Pound, " +
                    "Riyal, Rand, and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter franc amount you want to convert: ");
            francAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = francToUSDollar(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " Dollars");
                    break;
                case "pound":
                    result = francToUKPound(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " Dong");
                    break;
                case "lira":
                    result = francToTurkeyLira(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " Lira");
                    break;
                case "dong":
                    result = francToVietnamDong(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " dong");
                    break;
                case "krona":
                    result = francToSwedenKrona(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " krona");
                    break;
                case "riyal":
                    result = francToSaudiRiyal(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = francToSouthAfricanRand(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = francToNepalRupee(francAmount);
                    System.out.println("The conversion from " + francAmount + " franc is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end franc switch

        }//end if franc

        if (startingCurrency.equalsIgnoreCase("riyal")) { // start krone if
            double riyalAmount;
            double result;

            System.out.println("Available currency's are: Dollar, Lira, Krona, Franc, Dong, Pound, " +
                    " Rand and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter riyal amount you want to convert: ");
            riyalAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = riyalToUSDollar(riyalAmount);
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + result + " Dollars");
                    break;
                case "pound":
                    result = riyalToUKPound(riyalAmount);
                    System.out.println("The conversion from " + result + " riyal is about " + result + " Dong");
                    break;
                case "lira":
                    result = riyalToTurkeyLira(riyalAmount);
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + result + " Lira");
                    break;
                case "dong":
                    result = riyalToVietnamDong(riyalAmount);
                    System.out.println("The conversion from " + result + " riyal is about " + result + " dong");
                    break;
                case "krona":
                    result = riyalToSwedenKrona(riyalAmount);
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + result + " krona");
                    break;
                case "franc":
                    result = riyalToSwissFranc(riyalAmount);
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + result + " franc(s)");
                    break;
                case "rand":
                    result = riyalToSouthAfricanRand(riyalAmount);
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + result + " Rand(s)");
                    break;
                case "rupee":
                    result = riyalToNepalRupee(riyalAmount);
                    System.out.println("The conversion from " + riyalAmount + " riyal is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end riyal switch

        }//end if riyal

        if (startingCurrency.equalsIgnoreCase("rand")) { // start krone if
            double randAmount;
            double result;

            System.out.println("Available currency's are: Dollar, Dong, Pound, " +
                    " Krone, Riyal, Lira, Franc and Rupee.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter rand amount you want to convert: ");
            randAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = randToUSDollar(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " Dollars");
                    break;
                case "pound":
                    result = randToUKPound(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " Dong");
                    break;
                case "lira":
                    result = randToTurkeyLira(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " Lira");
                    break;
                case "dong":
                    result = randToVietnamDong(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " dong");
                    break;
                case "krona":
                    result = randToSwedenKrona(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " krona");
                    break;
                case "franc":
                    result = randToSwissFranc(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " franc(s)");
                    break;
                case "riyal":
                    result = randToSaudiRiyal(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " Riyal(s)");
                    break;
                case "rupee":
                    result = randToNepalRupee(randAmount);
                    System.out.println("The conversion from " + randAmount + " rand is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end rand switch

        }//end if rand

        if (startingCurrency.equalsIgnoreCase("rupee")) { // start rupee if
            double rupeeAmount;
            double result;

            System.out.println("Available currency's are: Dollar, Dong, Pound, " +
                    " Krone, Riyal, Lira, Franc and Rand.");
            System.out.println("What currency do you want to convert to?");
            String currency;
            currency = scanner.next();

            System.out.println("Please enter rupee amount you want to convert: ");
            rupeeAmount = scanner.nextDouble();


            switch (currency.toLowerCase()) {
                case "dollar":
                    result = rupeeToUSDollar(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " Dollars");
                    break;
                case "pound":
                    result = rupeeToUKPound(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " Dong");
                    break;
                case "lira":
                    result = rupeeToTurkeyLira(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " Lira");
                    break;
                case "dong":
                    result = rupeeToVietnamDong(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " dong");
                    break;
                case "krona":
                    result = rupeeToSwedenKrona(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " krona");
                    break;
                case "franc":
                    result = rupeeToSwissFranc(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " franc(s)");
                    break;
                case "riyal":
                    result = rupeeToSaudiRiyal(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " Riyal(s)");
                    break;
                case "rand":
                    result = rupeeToSouthAfricanRand(rupeeAmount);
                    System.out.println("The conversion from " + rupeeAmount + " rupee is about " + result + " Rupee(s)");
                default:
                    System.out.println("Invalid Currency");
            }//end rand switch

        }//end if rand
        scanner.close();
    }//end main method
}//end main class
