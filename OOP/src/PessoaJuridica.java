public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private String razaoSocial;

    public PessoaJuridica(String nome, String razaoSocial, String CNPJ) {
        super(nome);
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
}
