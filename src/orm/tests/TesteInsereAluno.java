package orm.tests;

import orm.actions.InsereAluno;
import orm.models.Aluno;

import java.util.Scanner;

public class TesteInsereAluno {
    public static void main(String[] args) {
        // Id, Nome, e-mail, CPF, Data de
        //Nascimento, Naturalidade e Endereço
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de aluno");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Data de nascimento (dd/mm/yyyy): ");
        String dataNascimento = sc.nextLine();
        System.out.print("Naturalidade: ");
        String naturalidade = sc.nextLine();
        System.out.println("Endereço: ");
        String endereco = sc.nextLine();

        Aluno aluno = new Aluno(nome, email, cpf, dataNascimento, naturalidade, endereco);

        InsereAluno insere = new InsereAluno();
        insere.insere(aluno);

        sc.close();

    }
}
