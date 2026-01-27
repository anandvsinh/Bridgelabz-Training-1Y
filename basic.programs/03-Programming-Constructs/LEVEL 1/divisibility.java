import java.util.Scanner;

class divisibility{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number:");
        int a = s.nextInt();

        if(a%5==0){
            System.out.println("Is the number "+a+" Divisible by 5? Yes");
        }

        else{
            System.out.println("Is the number "+a+" Divisible by 5? No");
        }


    }
}