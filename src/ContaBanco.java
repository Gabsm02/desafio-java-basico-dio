import java.util.Scanner;


public class ContaBanco {
    public static void main(String[] args) throws Exception {

        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá" + " " + titular + " " + "obrigado por cria uma conta em nosso banco, sua agência é:" + " " + agencia + " " + "e o número da sua conta é:" + " " + numero + " " + "e seu saldo é de:" + " " + saldo + " " + "reais, já disponível para movimentação.");

    }
}
