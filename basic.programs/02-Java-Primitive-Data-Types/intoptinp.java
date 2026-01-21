import java.util.Scanner;
public class intoptinp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = n.nextInt();
        System.out.println("Enter b: ");
        int b = n.nextInt();
        System.out.println("Enter c: ");
        int c = n.nextInt();

        int p = a+b*c;
        int q = a*b+c;
        int r = c+a/b;
        int s = a%b+c;

        System.out.println("The results of Int Operations are: "+p+","+q+","+r+", and "+s);
    }
}
