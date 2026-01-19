import java.util.Scanner;

public class interest{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double SI,Principal,Rate,Time;
		
		System.out.println("Enter Principal: ");
		Principal=sc.nextDouble();
		
		System.out.println("Enter Rate: ");
		Rate=sc.nextDouble();
		
		System.out.println("Enter Time: ");
		Time=sc.nextDouble();

		SI = (Principal * Rate * Time) / 100;
		System.out.println("Simple Interest=" +SI);
	}
}	
		