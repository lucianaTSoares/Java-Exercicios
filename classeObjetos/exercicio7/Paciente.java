package classeObjetos.exercicio7;

public class Paciente {

    private String nomePaciente;
    private String dataNasc;
    private String cpf;
    private String rg;
    private String especialidade;
    private int horaConsulta;
    private String diaConsulta;

    public Paciente() {

        this.nomePaciente = "Samuel";
        this.dataNasc = "10/03/1998";
        this.cpf = "507.126.658-01";
        this.rg = "65.924.078-2";
        this.especialidade = "Odontologia";
        this.horaConsulta = 18;
        this.diaConsulta = "02/02/2022";
    }

    public void verificarConsulta() {
        
        if (diaConsulta != null && horaConsulta != 0) {
            System.out.println("\nO paciente possui uma consulta marcada!");
            System.out.println("Data: " + diaConsulta);
            System.out.println("Horário: " + horaConsulta + "h");
            System.out.println("Especialidade: " + especialidade);
            System.out.println("\n");
        } else
            System.out.println("O paciente não possui consulta marcada.");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do paciente: " + nomePaciente);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("\n");
    }
}
