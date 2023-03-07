import java.util.Scanner;

public class CriaConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        System.out.print("Qual o seu saldo? ");
        primeiraConta.saldo = sc.nextDouble();

        System.out.print("Qual sua agência? ");
        primeiraConta.agencia = sc.nextInt();

        System.out.print("Qual seu nome? ");
        primeiraConta.titular = sc.next();
        sc.nextLine();

        System.out.print("Qual é a sua conta? ");
        primeiraConta.numero = sc.nextInt();

        System.out.println("Nome do Titular: " + primeiraConta.titular);
        System.out.println("Numero da conta: " + primeiraConta.numero);
        System.out.println("Agencia: " + primeiraConta.agencia);
        System.out.println("Saldo: " + primeiraConta.saldo);

        System.out.println("--------------------------------------------------------------------------------------------");

        segundaConta.saldo = 500;
        segundaConta.agencia = 5;
        segundaConta.titular = "Caroline Guerreiro de Melllo";
        segundaConta.numero = 67891;

        System.out.println("Nome do Titular: " + segundaConta.titular);
        System.out.println("Numero da conta: " + segundaConta.numero);
        System.out.println("Agencia: " + segundaConta.agencia);
        System.out.println("Saldo: " + segundaConta.saldo);

        sc.close();
    }
}
