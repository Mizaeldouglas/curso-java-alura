package ByteBakEncapsulado;

public class TestaGetSet {
    public static void main(String[] args) {

        Conta conta =  new Conta();
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
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




