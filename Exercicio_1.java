import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int saldonovo=0;
        int saldo=0;
        int porcentagem=0;
        
        System.out.println("Digite o valor do saldo");
        saldo = sc.nextInt();
       
        System.out.println("Digite o valor da porcentagem");
        porcentagem=sc.nextInt();
        
        int conta= (saldo*porcentagem)/100;
        System.out.println("O valor do desconto é="+conta);
        
        int conta1= saldo-conta;
        System.out.println("O valor do novo saldo é ="+conta1);
        
	}

}
