package ByteBank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposita(300);
        System.out.println(conta.saldo);

        conta.deposita(500);
        System.out.println(conta.saldo);
        conta.saca(50);
        System.out.println(conta.saldo);

        System.out.println("------------------------------------------------------------------");

        Conta conta2 = new Conta();
        conta2.deposita(1000);

        boolean transferencia = conta2.transfere(300,conta);

        if(transferencia){
            System.out.println("transferencia feita com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Saldo da conta 2: " + conta2.saldo);

        System.out.println("Saldo da conta 1: " + conta.saldo);

    }
}
