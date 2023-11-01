public class Main {
    public static void main(String[] args) {
        
        PessoaFisica pessoaFisica = new PessoaFisica("Rafael Leite", 40, "1238718971", "12541254167" );
        PessoaJuridica pessoaJuridica = new PessoaJuridica("R-LAK", "RLAK Comercio Eletronico", "53444777000149");

        System.out.println(pessoaFisica.getNome() + " - " + pessoaFisica.getCPF());
        System.out.println(pessoaJuridica.getNome() + " - " +  pessoaJuridica.getCNPJ());

    }
}