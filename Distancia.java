import java.util.Scanner;
public class Distancia {
	public static void main(String[] args) {


double num1, num2, resD;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tempo médio gasto na viagem em minutos: ");
		num1 = sc.nextDouble();
		System.out.println("Digite a velocidade média do carro: ");
		num2 = sc.nextDouble();
		resD = num1 * num2;
		
		System.out.println("A distância percorrida foi: " + resD);
		
		
		double dist, resL;
		int numA;
		Scanner sc1 =  new Scanner (System.in);
		dist = 200.0;
		numA = 12;
		
		resL = dist / numA;
		
		System.out.println("A quantidade de litros de combustível gasta na viagem foi: " + resL);
		
	}
}

