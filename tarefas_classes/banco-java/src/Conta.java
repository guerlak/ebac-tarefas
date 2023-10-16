/**
 * @author Rafael Leite
 */
public class Conta {

    private Cliente cliente;
    private double saldo;

    /**
     *
     * @param valor quantia a ser adicionado ao saldo
     */
    public void deposito(double valor){
        this.saldo += valor;
    }

    /**
     *
     * Metodo de saque de valores do saldo da conta, a funcao vai subtrair do saldo o valor informado como parametro
     * Só será permitida a operacao, caso o saldo seja amior que o valor parametrizado
     *
     * @param valor quantia a ser sacada/subtraido do saldo
     */
    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        }else{
            System.out.println("Não permitido, saldo insuficiente");
        }
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
