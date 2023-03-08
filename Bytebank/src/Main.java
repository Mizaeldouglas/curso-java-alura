public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco = new Endereco();
        p.endereco.logradouro = "Avenida XYZ";
        System.out.println(p.endereco.logradouro);
    }
}
 class Pessoa {

    String nome;
    String cpf;
    int idade;
    Endereco endereco;
}

 class Endereco {

    String logradouro;
    String complemento;
    String numero;
    String bairro;
    String cidade;
    String cep;

}