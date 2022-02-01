package classeObjetos.exercicio4;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String rg;
    private String cargo;
    private String PISCarteiraDeTrabalho;
    private String dataNascimento;
    private boolean trabalhando;

    public Funcionario() {
        this.nome = "José";
        this.cpf = "478.026.513-98";
        this.rg = "87.498.237-0";
        this.PISCarteiraDeTrabalho = "234.78720.22-5";
        this.cargo = "Desenvolvedor Java Jr.";
        this.dataNascimento = "02/01/2002";
        this.trabalhando = true;
    }

    public void realizarTarefa() {

        if (trabalhando == false) {
            System.out.println("" + nome + " não está trabalhando.");
        } else
            System.out.println("" + nome + " está trabalhando.");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("PIS Carteira de trabalho: " + PISCarteiraDeTrabalho);
        System.out.println("Cargo: " + cargo + "\n");
        realizarTarefa();
    }
}
