package aula_condicional;

public class bool_condicional {
    public static void main(String[] args) {

        int idade = 16;
        int quantidadePessoas = 1;
        if (idade >= 18 || quantidadePessoas >= 2){
            System.out.println("Seja Bem vindo!");
        }else {
            System.out.println("Infelismente você não pode entrar!");
        }
    }
}
