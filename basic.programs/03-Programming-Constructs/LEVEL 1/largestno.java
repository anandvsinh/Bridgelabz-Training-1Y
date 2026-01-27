import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first no.: ");
        int a = s.nextInt();
        System.out.println("Enter second no.: ");
        int b = s.nextInt();
        System.out.println("Enter third no.: ");
        int c = s.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("Is the first number the largest? Yes\n"+"Is the second number the largest? No\n"+"Is the third number the largest? No");
            }
            else{
                System.out.println("Is the first number the largest? No\n"+"Is the second number the largest? No\n"+"Is the third number the largest? Yes");
            }
        }
        else{
            if(b>c){
                System.out.println("Is the first number the largest? No\n"+"Is the second number the largest? Yes\n"+"Is the third number the largest? No");
            }
            else{
                System.out.println("Is the first number the largest? No\n"+"Is the second number the largest? No\n"+"Is the third number the largest? Yes");
            }
        }
        
    }
}
