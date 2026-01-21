import java.util.Scanner;
public class handshakeinp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Number of students: ");
        int nos = n.nextInt();

        int phandshakes = (nos*(nos-1))/2;

        System.out.println("No. of Handshakes possible: "+phandshakes);
    }
}
