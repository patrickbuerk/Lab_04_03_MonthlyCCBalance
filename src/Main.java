public class Main
{

    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double monthOneInterest = (creditCardBalance * 0.17)+ creditCardBalance;
        System.out.println("Your current credit card balance = "+ creditCardBalance);
        System.out.println("Your current credit card balance after one month = "+ monthOneInterest);
        double monthTwoInterest = (monthOneInterest * 0.17)+ monthOneInterest;
        System.out.println("Your current credit card balance after 2 months = "+ monthTwoInterest);


    }
}
