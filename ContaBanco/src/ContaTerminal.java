import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem Conta Criada

        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência: ");
        var numberAg = scanner.next();
        System.out.println("Por favor digite o número da Conta: ");
        var numberCta = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        var nameCli = scanner.next();
        var saldoCta  = 250.0d;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua Agência é %s, sua conta é %s e seu saldo R$%s já está disponível para saque.", nameCli, numberAg, numberCta, saldoCta);
        System.out.println("\nDigite o valor para saque: ");
        var valorSq = scanner.nextDouble();

        while(valorSq > saldoCta){
            System.out.println("Saldo Insuficiente. Por favor, tente outro valor: ");
            valorSq = scanner.nextDouble();
        }
            saldoCta =  saldoCta - valorSq;
            System.out.printf("Saque realizado com sucesso! O valor atual na sua conta é R$%s", saldoCta);
    }
}
