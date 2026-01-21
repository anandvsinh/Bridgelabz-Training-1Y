import java.util.Scanner;
public class discfeeinp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Fee: ");
        int fee = s.nextInt();
        System.out.println("Enter Discount: ");
        int disc = s.nextInt();

        int tdisc = (fee*disc)/100;
        int discfee = fee-tdisc;

        System.out.println("The discount amount is INR "+tdisc+" and final discounted fee is INR "+discfee);

    }
}
