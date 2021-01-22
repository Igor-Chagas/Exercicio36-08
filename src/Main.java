import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double imp;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor do seu salario [R$]:");
		double sal = sc.nextDouble();	
		
		if (sal >= 0.00 && sal <= 2000.00) {
		System.out.println("Isento");
		}
		else {if (sal < 2000.00 && sal <= 3000.00) {
		imp = sal * 0.08;
		}
		else if (sal > 3000.00 && sal <= 4500.00 ) {
		imp = sal * 0.18;
		}
		else {
		imp = sal * 0.28;
		}
		System.out.printf("R$ %.2f\n",imp);
		}
		sc.close();
		}
}


