import java.util.Scanner;
public class quotientinp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = n.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = n.nextInt();
        int div;
        int rem;

        if(a>b){
            div = a/b;
            rem = a%b;
        }
        else{
            div = b/a;
            rem = b%a;
        }
        

        System.out.println("The Quotient is "+div+" and Reminder is "+rem+" of two number "+a+" and "+b);
    }
}
