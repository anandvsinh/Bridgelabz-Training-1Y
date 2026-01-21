import java.util.Scanner;

public class dbleoptinp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = n.nextInt();
        System.out.println("Enter b: ");
        double b = n.nextInt();
        System.out.println("Enter c: ");
        double c = n.nextInt();

        double  p = a+b*c;
        double q = a*b+c;
        double r = c+a/b;
        double s = a%b+c;

        System.out.println("The results of Int Operations are: "+p+","+q+","+r+", and "+s);
    }
}
