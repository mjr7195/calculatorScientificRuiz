
public class Conversions {
    /* methods to calculate conversions */
    public double usToTurkeyLira(double bucks){
        double exchangeRate = 27.22;
        return Math.multiplyExact((int) bucks, (int) exchangeRate);
    }
    public double usToVietnamDong(double bucks){
        double exchangeRate = 24395.00;
        return Math.multiplyExact((int) bucks, (int) exchangeRate);
    }

}
