public class profit{
    public static void main(String[] args) {
        
        int cp = 129;
        int sp = 191;
        
        int profit = sp-cp;
        int profitpercent = profit*100/cp;

        System.out.printf("The Cost price is "+cp+" and Selling price is INR "+sp+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitpercent);
    }
}
