import java.util.Scanner;
public class quantitypriceinp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter Unit price:");
        float p = n.nextInt();
        System.out.println("Enter Quantity: ");
        int q = n.nextInt();

        float tprice = p*q;

        System.out.println("The total purchase price is INR "+tprice+" if the quantity is "+q+" and unit price is INR "+p);
    }
}
