package ByteBakEncapsulado;

public class TestaGetSet {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta conta =  new Conta(500,012,12358,cliente);

        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        conta.setTitular(cliente);

        cliente.setNome("Mizael");
        cliente.setCpf("123.456.178.90");
        cliente.setProfissao("Programador");

        System.out.println(
                    "Nome: " + cliente.getNome() +
                    " CPF: " + cliente.getCpf() +
                    " Profissao: " + cliente.getProfissao()
                );

    }
}




