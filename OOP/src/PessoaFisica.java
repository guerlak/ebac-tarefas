public class PessoaFisica extends Pessoa{

    private String CPF;
    private int idade;
    private String identidade;

    public PessoaFisica(String nome, int idade, String CPF, String identidade) {
        super(nome);
        this.idade = idade;
        this.CPF = CPF;
        this.identidade = identidade;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public String getIdentidade() {
        return identidade;
    }
}
