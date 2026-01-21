import java.util.Scanner;
public class perimeterinp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter side: ");
        int s = in.nextInt();

        int p = 4*s;
        
        System.out.println("The length of the side is "+s+" whose perimeter is "+p);
    }
}
