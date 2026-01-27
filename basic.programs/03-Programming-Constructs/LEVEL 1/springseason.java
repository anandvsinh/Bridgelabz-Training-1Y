import java.util.Scanner;
public class springseason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Month no.: ");
        int a = s.nextInt();
        System.out.println("Enter Day: ");
        int b = s.nextInt();

        if(3<=a && a<6){
            if(a==6) {
                if(a<=20){
                    System.out.println("Its a Spring Season");
                }
                else{
                    System.out.println("Its not a Spring Season");
                }
            if(20<=a && a<=31){
                System.out.println("Its a Spring Season");
            }
            else{
                System.out.println("Its not a Spring Season\nOR\nInvalid Input");
            }
        }
        }
        else{
            System.out.println("Its not a Spring Season");
        }

    }
}
