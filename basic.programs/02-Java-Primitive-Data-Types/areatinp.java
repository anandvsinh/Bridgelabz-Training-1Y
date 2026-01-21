import java.util.Scanner;
public class areatinp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter base: ");
        int b = s.nextInt();
        System.out.println("Enter height: ");
        int h = s.nextInt();

        float area = 0.5f*b*h;
        float areai = area/2.54f;
        float areaf = areai/12;


        System.out.println("Your Area in cm is "+area+" while in feet is "+areaf+" and inches is "+areai);

    }
}
