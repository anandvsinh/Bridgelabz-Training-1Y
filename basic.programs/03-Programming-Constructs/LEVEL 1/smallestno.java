import java.util.Scanner;

public class smallestno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st no.: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd no.: ");
        int b = s.nextInt();
        System.out.println("Enter 3rd no.: ");
        int c = s.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("Is the first number the smallest? Yes");
            }
            else{
                System.out.println("Is the first number the smallest? No");
            }
        }
        else{
            System.out.println("Is the first number the smallest? No");
        }
    }
}
