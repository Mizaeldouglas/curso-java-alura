package ByteBankComposto;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente mizael = new Cliente();
        mizael.nome = "Mizael Douglas de Mello";
        mizael.cpf = "428.330.178.71";
        mizael.profissao = "Desenvolvedor";

        Conta contaDoMizael = new Conta();
        contaDoMizael.titular = mizael;
        contaDoMizael.deposita(1000);

        System.out.println(contaDoMizael.titular.nome + " " + contaDoMizael.getSaldo() );

    }
}
