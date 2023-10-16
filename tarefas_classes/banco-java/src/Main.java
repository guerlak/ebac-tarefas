public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.informarIdNome("1234134", "Martina Barbosa");

        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.sacar(1400);
        conta.deposito(20000.76);
        conta.sacar(1400);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getCliente().getNome());
    }
}