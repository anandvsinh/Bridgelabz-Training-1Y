import java.util.Scanner;
public class kmtomileinp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Distance in km: \n");
        int km = s.nextInt();

        float kmtomile = km*1.6f;

        System.out.println("The total miles is "+kmtomile+" mile for the given "+km+" km");
    }
}
