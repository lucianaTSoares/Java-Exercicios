package classeObjetos.exercicio7;

import java.util.Scanner;

public class ConsolePaciente {
    
    public static void main(String[] args) {
        
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        int opcao;

        paciente.mostrarInformacoes();

        System.out.println("Deseja verificar se o paciente possui consulta marcada?");
        System.out.print("1. Sim\n2. Não\n\nNúmero: ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            paciente.verificarConsulta();
        } else {
            System.exit(0);
        }
        sc.close();
    }

}
