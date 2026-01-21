import java.util.Scanner;
public class feettomileinp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        float feet = in.nextInt();
        float yard = feet/3;
        float mile = yard/1760;

        System.out.println("Your distance in feet is "+feet+" while in yards is "+yard+" and in miles is "+mile);
    }
}
