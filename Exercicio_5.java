import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salario");
        double salario=sc.nextDouble();
        System.out.println("Digite o valor de quilowatts gasto");
        double qw=sc.nextDouble();
        
        double sr= salario/7;
        double ppqw= (1*sr)/100;
        System.out.println("O valor de cada quilowatts é="+ppqw);
        double pagar= ppqw*qw;
        System.out.println("O valor a ser pago é ="+pagar);
        double desc= (pagar - pagar*10/100);
        System.out.println("O valor a ser pago após o desconto é="+desc);
        
        
        
	}

}
