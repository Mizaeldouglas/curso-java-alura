package ByteBakEncapsulado;

public class TestaValores {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta conta = new Conta(500,2222,12358,cliente);
        Conta conta2 = new Conta(1500,2222,16998,cliente);
        Conta conta3 = new Conta(1500,2222,16998,cliente);

        conta.setAgencia(50);
        conta.setNumero(20);
        System.out.println(Conta.getTotal());
    }
}
