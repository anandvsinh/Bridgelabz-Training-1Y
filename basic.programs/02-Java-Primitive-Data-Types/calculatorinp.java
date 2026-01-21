import java.util.Scanner;
public class calculatorinp {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = s.nextInt();
        System.out.println("Enter value of b: ");
        int b = s.nextInt();

        int sum = a+b;
        int sub;
        int div;
        if(a>b){
            div = a/b;
            sub = a-b;
        }
        else{
            div = b/a;
            sub = b-a;
        }
        int mul = a*b;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+sum+","+sub+","+mul+", and "+div);
    }
}
