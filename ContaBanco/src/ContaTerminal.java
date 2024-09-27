import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importando a classe Scanner para capturar os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Exibindo mensagens e capturando os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o próximo Int

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
