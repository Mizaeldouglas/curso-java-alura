package ByteBankHerdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario mizael = new Funcionario();
        mizael.setNome("Mizael Douglas");
        mizael.setCpf("428.330.178.71");
        mizael.setSalario(2600.00);

        System.out.println(mizael.getNome());
        System.out.println(mizael.getBonificacao());

    }
}
