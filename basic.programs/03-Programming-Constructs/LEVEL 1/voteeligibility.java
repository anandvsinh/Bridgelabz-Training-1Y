import java.util.Scanner;
public class voteeligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int a = s.nextInt();

        if(a>=18){
            System.out.println("The person's age is "+a+" and can vote.");
        }
        else{
            System.out.println("The person's age is "+a+" and cannot vote.");
        }
    }
}
