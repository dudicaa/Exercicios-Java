import java.util.Scanner;

public class Exercicio_6 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        System.out.println("Digite se o modelo do carro é  A, B ou C");
        int carro = sc.nextInt();
        System.out.println("Digite quantos km o carro andou");
        double km=sc.nextDouble();
        int A=1;
		int B=2;
		int C=3;
		if(carro==A) {
        double cc=(km*1)/12;
        System.out.println("O consumo de gasolina foi="+cc);
       }
        else if(carro==B) {
        double cc=(km*1)/9;
        System.out.println("O consumo de gasolina foi="+cc);
       }
        else if(carro==C) {
        double cc=(km*1)/8;
        System.out.println("O consumo de gasolina foi ="+cc);
       }
        else {
        System.out.println("Você digitiou um modelo inexistente");
        }
	}

}
