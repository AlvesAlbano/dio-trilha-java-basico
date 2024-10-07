import java.util.Scanner;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void inserirDados(){
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta! :");
        numero = input.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = input.next();
        System.out.println("Por favor, digite o nome do Cliente!");
        input.nextLine();
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o saldo da Conta!");
        saldo = input.nextDouble();
    }

    public void retornaValores(){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",nomeCliente.toUpperCase(),agencia,numero,saldo);
    }

    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco();
        contaBanco.inserirDados();
        contaBanco.retornaValores();
    }
}