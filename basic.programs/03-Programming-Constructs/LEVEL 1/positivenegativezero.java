import java.util.Scanner;
public class positivenegativezero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = s.nextInt();

        if(a<0){
            System.out.println("Negative");
        }
        else if(a==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Positive");
        }
    }
}
