import java.util.Scanner;
public class cmtofeetinchinp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter height in cm: ");
        int hcm = s.nextInt();
        float hinch = hcm/2.54f;
        float height = hinch/12;

        System.out.println("Your Height in cm is "+hcm+" while in feet is "+height+" and inches is "+hinch);
    }
}
